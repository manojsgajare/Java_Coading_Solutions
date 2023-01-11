package Projects.Vehicle;

public class CarRental extends VehicleRental {

    private String carType;

    public CarRental(Customer customer, int noOfKms, String carType) {
        super(customer, noOfKms);
        this.carType = carType;
    }

    // To_Trainee
    public double calculateFinalAmount() {
        double finalAmount = 0.0;
        int rentPerDay = CarDetails.identifyPerDayRent(carType);
        int excessKms = super.identifyJourneyDays();
        if (rentPerDay == -1 || excessKms < 0 || super.getJourneyDays() < 0) {
            finalAmount = -1.0;
        } else {
            float rentalAmount = (super.getJourneyDays() * rentPerDay);
            int excessKmsAmount = excessKms * 12;
            rentalAmount = rentalAmount + excessKmsAmount;
            float discountAmount = getCustomer().calculateDiscount(rentalAmount);
            if (discountAmount == -1.0f) {
                finalAmount = -1.0;
            } else {
                finalAmount = (rentalAmount - discountAmount);
                for (int i = 0; i <= getCustomer().memberCustIdArr.length - 1; i++) {
                    if (getCustomer().memberCustIdArr[i].equals(getCustomer().getCustId())) {
                        getCustomer().memberBillAmountArr[i] += finalAmount;
                    }
                }
            }
        }
        return finalAmount;
    }

}
