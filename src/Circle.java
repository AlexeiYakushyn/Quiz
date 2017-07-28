/**
 * Created by java2 on 27.07.17.
 */
public class Circle implements Shape {
    public static final double PI = 3.14;
    int radius;
    public double size;
    public Colour colour;

    public double getCircleSize(int radius) {
        this.size = PI * Math.pow(this.radius, 2);
        return size;
    }

    public Circle(double size, Colour colour) {
        this.size = size;
        this.colour = colour;
    }

    @Override
    public double size() {
        return this.size;
    }

    @Override
    public Colour colour() {
        return this.colour;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "size=" + size +
                ", colour=" + colour +
                '}';
    }
}
