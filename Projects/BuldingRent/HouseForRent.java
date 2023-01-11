package Projects.BuldingRent;

import java.util.Arrays;

public class HouseForRent extends BuildingForRent {
    private static String[][] facilitiesDetailsArr = { { "Security", "Parking", "Amusement-Park" },
            { "2000", "3400", "2900" } };
    private String[] facilities;
    private int noOfBedrooms;

    public HouseForRent(int buildingDimensions, int noOfBedrooms, String[] facilities) {
        super(buildingDimensions);
        this.noOfBedrooms = noOfBedrooms;
        this.facilities = facilities;
    }

    public int getNoOfBedrooms() {
        return this.noOfBedrooms;
    }

    public String[] getFacilities() {
        return this.facilities;
    }

    // To_Trainee
    public Boolean validateNoOfBedrooms() {
        // write your code here
        if (this.noOfBedrooms > 0 && this.noOfBedrooms < 6) {
            return true;
        }
        // change return statement accordingly
        return false;
    }

    // To_Trainee
    @Override
    public void calculateAdvanceAmount() {
        // write your code here
        super.calculateAdvanceAmount();
        float totalcharge = 0.0f;
        float basicAmount = super.getAdvanceAmount();
        if (basicAmount == -1.0f || validateNoOfBedrooms() == false || facilities == null) {
            super.setAdvanceAmount(-1);
        } else {
            for (String f : facilities) {
                for (int i = 0; i <= facilitiesDetailsArr[0].length - 1; i++) {
                    if (facilitiesDetailsArr[0][i].equalsIgnoreCase(f)) {
                        totalcharge += Float.parseFloat(facilitiesDetailsArr[1][i]);
                    } else {
                        super.setAdvanceAmount(-1);
                    }
                }
            }
            if (totalcharge != 0.0f) {
                super.setAdvanceAmount(basicAmount + totalcharge + (noOfBedrooms * 20000));
            }
        }
    }

    @Override
    public String toString() {
        return "HouseForRent (BuildingForRent (buildingDimensions=" + this.getBuildingDimensions()
                + ")facilities=" + Arrays.toString(this.facilities)
                + ", noOfBedrooms=" + this.noOfBedrooms + ")";
    }
}
