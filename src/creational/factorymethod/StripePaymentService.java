package creational.factorymethod;


// Concrete Products
public class StripePaymentService implements PaymentService{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Stripe.");
    }
}
