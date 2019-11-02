public class CardPayment implements PaymentType {

    @Override
    public String executePayment() {
        return "Paid by creditCard";
    }
}
