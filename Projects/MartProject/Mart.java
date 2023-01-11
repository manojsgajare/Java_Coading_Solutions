package Projects.MartProject;

public class Mart {
    public static String[] itemNameArr = { "Chocolate", "Perfume", "Bouquet", "Apparel" };
    public static int[] itemPriceArr = { 200, 400, 150, 300 };
    public static int[] itemQuantityArr = { 10, 20, 30, 40 };

    public float findPricePerItem(String itemName) {
        float priceItem = -1.0f;
        for (int index = 0; index < Mart.itemNameArr.length; index++) {
            if (itemName.equals(Mart.itemNameArr[index])) {
                priceItem = Mart.itemPriceArr[index];
            }
        }
        return priceItem;
    }
}
