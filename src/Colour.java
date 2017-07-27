/**
 * Created by lexey.yakushin on 27.07.17.
 */
public enum Colour {
    RED,
    GREEN,
    BLUE;

    public int getCost() {
        Colour colour = null;
        int price = 0;

        switch (colour) {
            case RED:
                price = 25;
                break;
            case GREEN:
                price = 30;
                break;
            case BLUE:
                price = 35;
                break;
        }
        return price;
    }
}