import drawingtool.BlueBorderDrawing;
import shapes.Circle;
import shapes.Shape;

/**
 * Created by sayantjm on 21/11/20
 */
public class Main {
    public static void main(String... args) {
        Shape circle = new Circle();
        circle = new BlueBorderDrawing(circle);
        System.out.println(circle.getDescription().concat("->").concat(circle.draw()));
    }
}
