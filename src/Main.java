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





    }

    private double calculateCost(List<Shape> shapes, Colour filterColour){
        for (int i =0; i < shapes.size(); i ++){
          //  double cost = (shapes.get(i).size() * shapes.get(i));
        }
        return 0;
    }

    private Shape findMostExpensive(List<Shape> shapes){
        return null;
    }
}


