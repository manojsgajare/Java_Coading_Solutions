package Projects.Cricket;

public class Player {
    private int noOfMatches;
    private int pointsEarned;

    public Player(int noOfMatches) {
        this.noOfMatches = noOfMatches;
    }

    public int getPointsEarned() {
        return this.pointsEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public int getNoOfMatches() {
        return this.noOfMatches;
    }

    // To_Trainees
    public Boolean validateNoOfMatches() {
        // write your logic here
        if (noOfMatches > 0 && noOfMatches <= 100) {
            return true;
        }
        // change return statement accordingly
        return false;
    }

    @Override
    public String toString() {
        return "Player (noOfMatches=" + this.noOfMatches + ")";
    }
}
