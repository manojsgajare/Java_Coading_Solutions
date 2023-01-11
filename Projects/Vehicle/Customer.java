package Projects.Vehicle;

public class Customer {
    public static String[] memberCustIdArr = { "1001P", "1051R", "1072P", "2019R", "2913R", "2931P" };
    public static int[] memberBillAmountArr = { 2050, 5345, 6896, 9100, 4500, 3234 };
    private String custId;
    private String custName;

    public Customer(String custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }

    public String getCustId() {
        return this.custId;
    }

    public String getCustName() {
        return this.custName;
    }

    // To_Trainee
    public float calculateDiscount(float rentalAmount) {
        float discountAmount = -1.0f;
        for (int i = 0; i <= memberCustIdArr.length - 1; i++) {
            if (memberCustIdArr[i].equals(this.custId)) {
                this.upgradeCustomer(rentalAmount);
                char lc = this.custId.charAt(this.custId.length() - 1);
                if (lc == 'P') {
                    discountAmount = (15.0f / 100.0f) * rentalAmount;
                } else if (lc == 'R') {
                    discountAmount = (10.0f / 100.0f) * rentalAmount;
                } else {
                    discountAmount = -1.0f;
                }
            }
        }
        return discountAmount;
    }

    public void upgradeCustomer(float rentalAmount) {
        if (rentalAmount >= 15000) {
            int index = 0;
            for (int ind = 0; ind < Customer.memberCustIdArr.length; ind++) {
                if (Customer.memberCustIdArr[ind].equals(this.custId)) {
                    index = ind;
                    break;
                }
            }
            this.custId = this.custId.substring(0, 4) + "P";
            Customer.memberCustIdArr[index] = this.custId;
        }
    }
}
