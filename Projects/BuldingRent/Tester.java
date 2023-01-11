package Projects.BuldingRent;

public class Tester {
    public static void main(String[] args) {
        String[] facilities = { "PArking", "SecUrity" };
        HouseForRent obj1 = new HouseForRent(2000, 5, facilities);
        obj1.calculateAdvanceAmount();
        System.out.println("House Rent Amount:" + obj1.getAdvanceAmount());

        ShopForRent obj2 = new ShopForRent(10000, 'A');
        obj2.calculateAdvanceAmount();
        System.out.println("Shop Rent Amount:" + obj2.getAdvanceAmount());
    }
}
