import java.util.ArrayList;
import java.util.List;

/**
 * Created by java2 on 27.07.17.
 */
public class Main {

    public static void main(String[] args) {
        Shape redSquare = new Square(10, Colour.RED);
        Shape greenSquare = new Square(12, Colour.GREEN);
        Shape blueSquare = new Square(5, Colour.BLUE);
        Shape redCircle = new Circle(23, Colour.RED);
        Shape greenCircle = new Circle(9, Colour.GREEN);
        Shape blueCircle = new Circle(25, Colour.BLUE);

        ArrayList<Shape> ppz = new ArrayList<>();
        ppz.add(redSquare);
        ppz.add(blueSquare);
        ppz.add(greenSquare);
        ppz.add(redCircle);
        ppz.add(greenCircle);
        ppz.add(blueCircle);

        System.out.println(ppz);

        System.out.println(calculateCost(ppz, Colour.RED));
        System.out.println(calculateCost(ppz, Colour.GREEN));
        System.out.println(calculateCost(ppz, Colour.BLUE));
    }

    private static double calculateCost(List<Shape> shapes, Colour filterColour) {
        double cost;
        cost = 0;
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i).colour() == filterColour) {
                cost = (shapes.get(i).size() * shapes.get(i).colour().cost());
            }
        }
        return cost;
    }

    private Shape findMostExpensive(List<Shape> shapes) {
        return null;
    }
}


