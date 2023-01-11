package Projects.MartProject;

public class Tester {
    public static void main(String[] args) {
        Order orderObj = new Order("Chocolate", 4, "COD");
        OnlineMart onlineMartObject = new OnlineMart(orderObj);
        onlineMartObject.shipOrder();
        System.out.println("Tracking ID :" + onlineMartObject.getOrder().getTrackingId());
        System.out.println("Order Price :" + onlineMartObject.getOrder().getOrderPrice());
    }
}
