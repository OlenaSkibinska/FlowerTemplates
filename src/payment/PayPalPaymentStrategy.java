package payment;


public class PayPalPaymentStrategy implements IPayment {
    public double pay(double price){
        return  price;
    }
}
