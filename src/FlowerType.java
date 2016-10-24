/**
 * Created by cs.ucu.edu.ua on 10/17/2016.
 */
public enum FlowerType {
    ROMASHKA, MAK, ROZA, TULPAN;

    //@Override
    public String toString() {
        switch (this){
            case ROMASHKA:
                return "Romashka";
            case MAK:
                return "Mak";
            case ROZA:
                return "Roza";
            case TULPAN:
                return "Tulpan";
            default:
                return "no flower";
        }
    }
}
