package enums;

public enum FlowerColor {
    RED, GREEN, GRAY;

    //@Override
    public String toString() {

        switch (this) {
            case GREEN:
                return "Green"; // якщо нема брейку. то буде виводити останній елмент
            case RED:
                return "Red";
            case GRAY:
                return "Gray";
            default:
               return  "no color";

        }
    }
}
