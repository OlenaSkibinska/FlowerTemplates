package decorator;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item itm) {
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
        return 13 + item.price();
    }
}
