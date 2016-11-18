package specs;

import enums.FlowerColor;

public abstract class Spec {
    public int price;
    public boolean fresh;
    public FlowerColor color;


    public Spec(int price, boolean fresh, FlowerColor color){
        this.price = price;
        this.fresh = fresh;
        this.color = color;
    }
    public abstract String getType();

}
