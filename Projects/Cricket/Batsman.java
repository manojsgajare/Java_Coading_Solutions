package Projects.Cricket;

public class Batsman extends Player {
    private int runsScored;
    private int centuryCount;
    private int batsmanRank;

    public Batsman(int noOfMatches, int runsScored, int centuryCount) {
        super(noOfMatches);
        this.runsScored = runsScored;
        this.centuryCount = centuryCount;
    }

    public int getRunsScored() {
        return this.runsScored;
    }

    public int getCenturyCount() {
        return this.centuryCount;
    }

    public int getBatsmanRank() {
        return this.batsmanRank;
    }

    @Override
    public String toString() {
        return "Batsman (Player (noOfMatches=" + this.getNoOfMatches() + ")+runsScored=" + this.runsScored
                + ", centuryCount="
                + this.centuryCount + ")";
    }

    // To_Trainee
    public Boolean validateBatsmanRecord() {
        // write your logic here
        if (centuryCount >= 0 && centuryCount <= getNoOfMatches() && centuryCount * 100 <= runsScored) {
            return true;
        }
        // change return statement accordingly
        return false;
    }

    // To_Trainees
    public void calculatePoints(int index) {
        // write your logic here
        if (validateNoOfMatches() && validateBatsmanRecord()) {
            int pointsforruns = 2 * runsScored;
            int pointsforcentury = 25 * centuryCount;
            setPointsEarned(pointsforcentury + pointsforruns);
            int oo = PlayerDetails.rankPlayer(getPointsEarned(), index);
            batsmanRank = oo;
        } else {
            setPointsEarned(-1);
            batsmanRank = -1;
        }
    }
}
