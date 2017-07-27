/**
 * Created by lexey.yakushin on 27.07.17.
 */
public enum Colour {
    RED,
    GREEN,
    BLUE;

    private int price = 0;

    public int getCost() {
        Colour colour = null;


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

    public int cost(){
        return this.price;
    }
}