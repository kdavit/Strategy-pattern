import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();
    private PaymentType paymentType;

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void additem(Item item) {
        items.add(item);
    }

    public void doPayments() {
        System.out.print(paymentType.executePayment());
        System.out.print(" for items: ");
        for (Item item : items) {
            System.out.print(item.getName() + " ");
        }
        System.out.println();
    }


}
