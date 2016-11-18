package specs;

import enums.FlowerColor;


public class FlowerSpec extends Spec {
    int length;
    public FlowerSpec(int price, boolean fresh, FlowerColor color, int length) {
        super(price, fresh, color);
        this.length = length;
    }
    @Override
    public String getType(){
        return  "Flower";
    }
}
