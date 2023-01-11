package Projects.BuldingRent;

public class BuildingForRent {
    private int buildingDimensions;
    private float advanceAmount;

    public BuildingForRent(int buildingDimensions) {
        this.buildingDimensions = buildingDimensions;
    }

    public float getAdvanceAmount() {
        return this.advanceAmount;
    }

    public void setAdvanceAmount(float advanceAmount) {
        this.advanceAmount = advanceAmount;
    }

    public int getBuildingDimensions() {
        return this.buildingDimensions;
    }

    public void calculateAdvanceAmount() {
        float advanceAmount = -1.0f;
        if (this.buildingDimensions > 0) {
            advanceAmount = this.buildingDimensions * 10;
        }
        this.advanceAmount = advanceAmount;
    }

    @Override
    public String toString() {
        return "BuildingForRent (buildingDimensions=" + this.buildingDimensions
                + ")";
    }
}
