package creational.factorymethod;

public class PayPalPaymentServiceFactory extends PaymentServiceFactory{

    @Override
    public PaymentService createPaymentService() {
        return new PayPalPaymentService();
    }
}
