package creational.factorymethod;

public class StripePaymentServiceFactory extends PaymentServiceFactory{

    @Override
    public PaymentService createPaymentService() {
        return new StripePaymentService();
    }
}
