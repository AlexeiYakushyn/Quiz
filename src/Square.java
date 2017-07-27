import java.awt.*;

/**
 * Created by lexey.yakushin on 27.07.17.
 */
public class Square implements Shape {
    private int a;
    public double size;
    public Colour colour;

    public Square(double size, Colour colour) {
        this.size = size;
        this.colour = colour;
    }

    public double getSquereSize(int a) {
        this.size = a * a;
        return size;
    }

    @Override
    public double size() {
        return size;
    }

    @Override
    public Colour colour() {
        return colour;
    }

}
