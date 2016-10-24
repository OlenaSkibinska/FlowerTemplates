import java.util.Arrays;

/**
 * Created by cs.ucu.edu.ua on 10/3/2016.
 */

public class Main {
    public static void main(String[] args) {
        Flower f_1 = new Flower(FlowerType.TULPAN, new FlowerSpec(1,true, FlowerColor.GRAY));
        Flower f_2 = new Flower(FlowerType.ROMASHKA, new FlowerSpec(3,false, FlowerColor.GREEN));
        Flower f_3 = new Flower(FlowerType.MAK, new FlowerSpec(2,false, FlowerColor.RED));
        Flower f_4 = new Flower(FlowerType.ROZA, new FlowerSpec(1,false, FlowerColor.GREEN));
        Bouquet my = new Bouquet();
        my.addFlower(f_1);
        my.addFlower(f_2);
        my.addFlower(f_3);
        my.addFlower(f_4);
        System.out.println(Arrays.toString(my.searchFlower(f_4)));

    }
}
