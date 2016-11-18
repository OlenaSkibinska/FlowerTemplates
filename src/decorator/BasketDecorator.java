package decorator;

public class BasketDecorator extends ItemDecorator {


    public BasketDecorator(Item itm) {
        super(itm);
    }
    public String  getDescription(){
        return item.toString();
    }

    @Override
    public double price() {
        return item.price();
    }

    public double getPrice(){
        return 4 + item.price();
    }

}
