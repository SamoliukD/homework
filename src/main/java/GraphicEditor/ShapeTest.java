package GraphicEditor;

public class ShapeTest {
    public static void main(String[] args) {
        ShapePrint printFigure = new ShapePrint();
        Shape rhombus = new Rhombus(32);
        Shape quad = new Quad(20, 20);
        Shape circle = new Circle(20, 10, 40);
        Shape square = new Square(15);
        Shape rectangle = new Rectangle(30, 20);


        printFigure.getShape(circle);
        printFigure.getShape(square);
        printFigure.getShape(rectangle);
        printFigure.getShape(rhombus);
        printFigure.getShape(quad);

    }
}
