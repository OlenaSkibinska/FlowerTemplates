import decorator.Item;
import deliver.IDelivery;
import payment.IPayment;

import java.util.LinkedList;


public class Order {
    LinkedList<Item> items = new LinkedList<>();
    IPayment payment;
    IDelivery delivery;
    public Order(){
    }
    public void setPaymentStrategy(IPayment payment){
        this.payment = payment;
    }
    public void setDeliveryStrategy(IDelivery delivery){
        this.delivery = delivery;
    }
    public double calculateTotalPrice(){
        double a = 0;
        for(Item i: items){
            a += i.price();
        }
        return a;
    }
    public void processOrder(){
        payment.pay(calculateTotalPrice());
        System.out.println("Total price of order: " + this.calculateTotalPrice());
        delivery.deliver(items);
    }
    public void addItem(Item b){
        items.add(b);
    }
    public void removeItem(Item b){
        items.remove(b);
    }
}
