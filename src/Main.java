public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.additem(new Item("12414412","monitor",125));
        shoppingCart.additem(new Item("12414412","mouse",30));
        shoppingCart.additem(new Item("12414412","keyboard",50));

        PaymentType paymentType = new PaypalPayment();

        shoppingCart.setPaymentType(paymentType);

        shoppingCart.doPayments();



        ShoppingCart shoppingCart1 = new ShoppingCart();
        shoppingCart1.additem(new Item("12414412","monitor1",225));
        shoppingCart1.additem(new Item("12414412","mouse1",230));
        shoppingCart1.additem(new Item("12414412","keyboard1",250));

        PaymentType paymentType1 = new CardPayment();

        shoppingCart1.setPaymentType(paymentType1);

        shoppingCart1.doPayments();
    }
}
