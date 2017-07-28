import java.awt.*;

/**
 * Created by lexey.yakushin on 27.07.17.
 */
public class Square implements Shape {
    private int side;
    public double size;
    public Colour colour;

    public Square(double size, Colour colour) {
        this.size = size;
        this.colour = colour;
    }

    public double size(int side) {
        size = side * side;
        return this.size;
    }

    @Override
    public double size() {
        return this.size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                ", colour=" + colour +
                '}';
    }

    @Override
    public Colour colour() {
        return this.colour;
    }

    @Override
    public int compareTo(Shape o) {
        return (int) ((this.size()* this.colour().cost()) - (o.size()*o.colour().cost()));
    }
}
