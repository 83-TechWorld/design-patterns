package creational.factorymethod;

import java.util.Calendar;
import java.util.logging.Logger;

/*
Imagine a Spring Boot application that processes payments through different payment gateways (e.g., PayPal, Stripe).
We can use the Factory Method pattern to create instances of payment services based on configuration.
 */
public class FactoryMethodMain {
    public static PaymentServiceFactory paymentServiceFactory(String paymentServiceType) {
        switch (paymentServiceType) {
            case "paypal":
                return new PayPalPaymentServiceFactory();
            case "stripe":
                return new StripePaymentServiceFactory();
            default:
                throw new IllegalArgumentException("Unknown payment service type");
        }
    }

    public static void main(String[] args) {
          PaymentServiceFactory paymentServiceFactory =paymentServiceFactory("paypal");
          paymentServiceFactory.process(3000);
        PaymentServiceFactory stripeFactory =paymentServiceFactory("stripe");
        stripeFactory.process(5000);
    }
}
