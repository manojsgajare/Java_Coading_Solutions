package Projects.Cricket;

public class Tester {
    public static void main(String[] args) {
        Batsman obj1 = new Batsman(10, 420, 3);
        obj1.calculatePoints(0);

        System.out.println("Batsman Points:" + obj1.getPointsEarned());
        System.out.println("Batsman Rank:" + obj1.getBatsmanRank());
        System.out.println("Player Points Array:");
        for (int index = 0; index < PlayerDetails.playersPointsArr.length; index++) {
            System.out.print(PlayerDetails.playersPointsArr[index] + " ");
        }

    }
}
