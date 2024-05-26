package creational.factorymethod;

// Creator Abstract Class:
public abstract class PaymentServiceFactory {

    public abstract PaymentService createPaymentService();

    public void process(double amount){
        PaymentService service = createPaymentService();
        service.processPayment(amount);
    }

}
