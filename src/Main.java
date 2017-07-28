import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by alexey.yakushin on 27.07.17.
 */
public class Main {

    public static void main(String[] args) {
        Shape redSquare = new Square(10, Colour.RED);
        Shape greenSquare = new Square(12, Colour.GREEN);
        Shape blueSquare = new Square(5, Colour.BLUE);
        Shape redCircle = new Circle(23, Colour.RED);
        Shape greenCircle = new Circle(9, Colour.GREEN);
        Shape blueCircle = new Circle(25, Colour.BLUE);

        List<Shape> ppz = new ArrayList<>();
        ppz.add(redCircle);
        ppz.add(greenCircle);
        ppz.add(blueCircle);
        ppz.add(redSquare);
        ppz.add(blueSquare);
        ppz.add(greenSquare);

        System.out.println(ppz);

        System.out.println(calculateCost(ppz, Colour.RED));
        System.out.println(calculateCost(ppz, Colour.GREEN));
        System.out.println(calculateCost(ppz, Colour.BLUE));

        System.out.println(findMostExpensive(ppz));
    }

    private static ArrayList<Double> calculateCost(List<Shape> shapes, Colour filterColour) {
        ArrayList<Double> cost = new ArrayList<>();
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).colour() == filterColour) {
                cost.add(shapes.get(i).size() * shapes.get(i).colour().cost());
            }
        }
        return cost;
    }

    private static Shape findMostExpensive(List<Shape> shapes) {
        Collections.sort(shapes);
        return shapes.get(shapes.size() - 1);
    }
}


