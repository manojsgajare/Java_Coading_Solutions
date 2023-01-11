package Projects.MartProject;

public class OnlineMart extends Mart {
    private int onlineDiscountPercentage;
    private Order order;

    public OnlineMart(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return this.order;
    }

    public void identifyOnlineDiscount() {
        if (this.order.getPaymentMode().equals("Prepaid")) {
            this.onlineDiscountPercentage = 5;
        } else if (this.order.getPaymentMode().equals("COD")) {
            this.onlineDiscountPercentage = 2;
        } else {
            this.onlineDiscountPercentage = -1;
        }
    }

    // To_Trainee
    @Override
    public float findPricePerItem(String itemName) {
        float pricePerItem = 0.0f;
        // write your code here
        float r = super.findPricePerItem(itemName);
        if (r == -1.0f) {
            pricePerItem = -1.0f;
        } else {
            this.identifyOnlineDiscount();
            if (onlineDiscountPercentage == -1) {
                pricePerItem = -1.0f;
            } else {
                pricePerItem = r - r * onlineDiscountPercentage / 100;
            }
        }
        return pricePerItem;
    }

    @Override
    public String toString() {
        return "OnlineMart (Order ( itemName=" + this.order.getItemName()
                + ", quantityRequired=" + this.order.getQuantityRequired() + ", paymentMode="
                + this.order.getPaymentMode() + "))";
    }

    // To_Trainee
    public int checkItemAvailability() {
        // write your code here
        for (int i = 0; i <= Mart.itemNameArr.length - 1; i++) {
            if (Mart.itemNameArr[i].equals(this.order.getItemName())) {
                if (Mart.itemQuantityArr[i] >= getOrder().getQuantityRequired()) {
                    Mart.itemQuantityArr[i] = Mart.itemQuantityArr[i] - this.order.getQuantityRequired();// 10
                    return getOrder().getQuantityRequired();
                }
            }
        }
        return -1;
    }

    // To_Trainee
    public void shipOrder() {
        // write your code here
        int ca = checkItemAvailability();
        float fn = findPricePerItem(getOrder().getItemName());
        if (ca == -1 || fn == -1.0f) {
            getOrder().setOrderPrice(-1.0);
            getOrder().setTrackingId("NA");
        } else {
            double c = ca * fn;
            getOrder().setOrderPrice(c);
            getOrder().generateTrackingId();
        }
    }
}
