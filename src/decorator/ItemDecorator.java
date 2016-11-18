package decorator;



public abstract class ItemDecorator implements Item {
        protected Item item;
    public ItemDecorator(Item itm){
        item = itm;
    }
}
