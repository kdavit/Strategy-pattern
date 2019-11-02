public class PaypalPayment implements PaymentType {

    @Override
    public String executePayment() {
        return "Paid by paypal";
    }
}
