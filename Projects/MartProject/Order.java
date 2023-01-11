package Projects.MartProject;

public class Order extends Mart {
    private static int counter = 1000;
    private String trackingId;
    private String itemName;
    private int quantityRequired;
    private String paymentMode;
    private double orderPrice;

    public Order(String itemName, int quantityRequired, String paymentMode) {
        this.itemName = itemName;
        this.quantityRequired = quantityRequired;
        this.paymentMode = paymentMode;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getTrackingId() {
        return this.trackingId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public int getQuantityRequired() {
        return this.quantityRequired;
    }

    @Override
    public String toString() {
        return "Order (trackingId=" + this.trackingId + ", itemName=" + this.itemName
                + ", quantityRequired=" + this.quantityRequired + ", paymentMode="
                + this.paymentMode + ", orderPrice=" + this.orderPrice + ")";
    }

    public String getPaymentMode() {
        return this.paymentMode;
    }

    public double getOrderPrice() {
        return this.orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    // To_Trainee
    public void generateTrackingId() {
        // write your code here
        this.trackingId = "TR" + counter++;
    }
}
