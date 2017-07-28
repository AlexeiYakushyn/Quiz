import com.sun.istack.internal.NotNull;

/**
 * Created by alexey.yakushin on 27.07.17.
 */
public interface Shape extends Comparable<Shape> {
    double size();
    Colour colour();

    @Override
    int compareTo(Shape o);
}
