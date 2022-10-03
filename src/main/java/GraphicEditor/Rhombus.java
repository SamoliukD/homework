package GraphicEditor;

class Rhombus extends Shape {
    private double x;
    private double y;
    private double side;
    private double perimeter;

    public Rhombus(double side) {
        this.side = side;
        this.perimeter = side * 4;
    }

    public Rhombus(double x, double y, double side) {
        this(side);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.perimeter = side * 4;

    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
        this.side = perimeter / 4;
    }

    public String getShape() {
        return "Rhombus";
    }

}


