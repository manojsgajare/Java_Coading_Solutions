package Projects.Vehicle;

public class CarDetails {
    private static String[] carTypesArr = { "Hatch-back", "Sedan", "SUV" };
    private static int[] perDayRentsArr = { 3500, 5000, 6000 };

    // To_Trainee
    public static int identifyPerDayRent(String carType) {
        int rentPerDay = 0;
        for (int i = 0; i <= carTypesArr.length - 1; i++) {
            if (carTypesArr[i].equalsIgnoreCase(carType)) {
                rentPerDay = perDayRentsArr[i];
                return rentPerDay;
            } else {
                rentPerDay = -1;
            }
        }
        return rentPerDay;
    }
}
