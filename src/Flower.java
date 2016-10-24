/**
 * Created by cs.ucu.edu.ua on 10/17/2016.
 */
public class Flower {
    protected FlowerType name;
    protected FlowerSpec spec;
    public Flower(FlowerType name, FlowerSpec a) {
        this.spec = a;
        this.name = name;



    }

    public String toString() {
        return this.getName() +  ", " + this.gerColor() + ", " + this.getPrice() + ", " + this.getFreshness();
    }


    public int getPrice() {
        return this.spec.price;
    }


    public boolean getFreshness() {return this.spec.fresh;}

    public FlowerColor gerColor(){return this.spec.color;}
    public FlowerType getName() {
        return name;
    }


}
