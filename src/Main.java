import decorator.BasketDecorator;
import decorator.PaperDecorator;
import decorator.RibbonDecorator;
import deliver.DHLDeliveryStrategy;
import enums.FlowerColor;
import payment.PayPalPaymentStrategy;
import specs.CactusSpec;
import specs.FlowerSpec;

public class Main {
    public static void main(String[] args) {
        CactusFlower cactus = new CactusFlower(new CactusSpec(12, true, FlowerColor.GREEN, true));
        RomashkaFlower romashka  = new RomashkaFlower(new FlowerSpec(7, false, FlowerColor.GRAY, 12));
        Bouquet my = new Bouquet();
        my.addFlowers(cactus);
        my.addFlowers(romashka);
        PaperDecorator paper = new PaperDecorator(my);
        RibbonDecorator ribbon = new RibbonDecorator(my);
        BasketDecorator basket = new BasketDecorator(my);

        Order order = new Order();
        order.addItem(paper);
        order.addItem(ribbon);
        order.addItem(basket);
        order.setDeliveryStrategy(new DHLDeliveryStrategy());
        order.setPaymentStrategy(new PayPalPaymentStrategy());
        order.processOrder();

    }
}
