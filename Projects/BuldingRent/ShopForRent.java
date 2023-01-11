package Projects.BuldingRent;

public class ShopForRent extends BuildingForRent {
    char shopType;

    public ShopForRent(int buildingDimensions, char shopType) {
        super(buildingDimensions);
        this.shopType = shopType;
    }

    // To_Trainee
    public int identifyShopRent() {
        int shopRent = -1;

        if (this.shopType == 'A' || this.shopType == 'a') {
            shopRent = 45000;
        }
        if (this.shopType == 'B' || this.shopType == 'b') {
            shopRent = 30000;
        }
        if (this.shopType == 'C' || this.shopType == 'c') {
            shopRent = 25000;
        }
        return shopRent;

    }

    // To_Trainee
    @Override
    public void calculateAdvanceAmount() {
        // write your code here
        super.calculateAdvanceAmount();
        float basicsalary = super.getAdvanceAmount();
        float x = (float) this.identifyShopRent();
        if (basicsalary == -1.0f || x == -1.0f) {
            super.setAdvanceAmount(-1);
        } else {

            super.setAdvanceAmount(basicsalary + x);
        }
    }

    @Override
    public String toString() {
        return "ShopForRent (BuildingForRent (buildingDimensions=" + this.getBuildingDimensions()
                + ")shopType=" + this.shopType + ")";
    }
}
