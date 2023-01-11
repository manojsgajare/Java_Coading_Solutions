package Projects.Cricket;

public class PlayerDetails {
    static int[] playersPointsArr = { 1000, 934, 800, 550 };

    public static void swap(int[] numbers, int firstIndex, int secondIndex) {
        int temp = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = temp;
    }

    public static int[] sort(int[] pointsArr) {
        for (int index2 = 0; index2 < PlayerDetails.playersPointsArr.length; index2++) {
            boolean swapped = false;
            for (int index3 = 0; index3 < (PlayerDetails.playersPointsArr.length - index2 - 1); index3++) {
                if (PlayerDetails.playersPointsArr[index3] < PlayerDetails.playersPointsArr[index3 + 1]) {
                    swap(PlayerDetails.playersPointsArr, index3, index3 + 1);
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        return pointsArr;
    }

    public static Integer rankPlayer(int pointsEarned, int index) {
        int playerRank = -1;
        playersPointsArr[index] = pointsEarned;
        sort(playersPointsArr);
        for (int i = 0; i <= playersPointsArr.length - 1; i++) {
            if (pointsEarned == playersPointsArr[i]) {
                playerRank = i;
                break;
            }
        }
        return playerRank + 1;
    }
}
