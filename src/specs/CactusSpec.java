package specs;

import enums.FlowerColor;
public class CactusSpec extends Spec {
        boolean sharpness;
    public CactusSpec(int price, boolean fresh, FlowerColor color, boolean sharpness) {
        super(price, fresh, color);
        this.sharpness = sharpness;
    }

    @Override
    public String getType() {
        return "Cactus";
    }
}
