/**
 * Created by lexey.yakushin on 27.07.17.
 */
public enum Colour {
    RED(60),
    GREEN(45),
    BLUE(30);

    private int price;

    Colour(int price) {
        this.price = price;
    }

    public int cost() {
        return (Colour.this.price);
    }


    @Override
    public String toString() {
        return this.price != 0 ? String.valueOf(this.price) : " ";
    }
}