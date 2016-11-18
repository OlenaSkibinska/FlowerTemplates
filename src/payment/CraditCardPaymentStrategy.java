package payment;


public class CraditCardPaymentStrategy implements IPayment {
    public double pay(double price){
        return  price;
    }
}
