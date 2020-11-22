import drawingtool.BlueBorderDrawing;
import shapes.Circle;
import shapes.Shape;

/**
 * Created by sayantjm on 21/11/20
 * This class is extending the shape tool with more decorations.
 * The jar Shape.2.0-SNAPSHOT has been added as dependency
 * and in the package drawingtool a new Decorator (BlueBorderDrawing) class has been added
 * It has been tested directly in the main as it is only an example of how it can be extended by
 * others developers.
 */
public class Main {
    public static void main(String... args) {
        Shape circle = new Circle();
        circle = new BlueBorderDrawing(circle);
        System.out.println(circle.getDescription().concat("->").concat(circle.draw()));
    }
}
