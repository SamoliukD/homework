package GraphicEditor;

class Square extends Shape {
    private double x;
    private double y;
    private double side;
    private double perimeter;
    private double squareArea;

    public Square(double x, double y, double side) {
        this(side);
        this.x = x;
        this.y = y;
    }

    public Square(double side) {
        this.side = side;
        this.perimeter = side * 4;
        this.squareArea = side * side;
    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setSide(double side) {
        this.side = side;
        this.perimeter = side * 4;
        this.squareArea = side * side;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
        this.side = perimeter / 4;
        this.squareArea = side * side;
    }

    public void setSquareArea(double squareArea) {
        this.squareArea = squareArea;
        this.side = squareArea / 2;
        this.perimeter = side * 4;
    }

    public double getSide() {
        return side;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getSquareArea() {
        return squareArea;
    }

    public String getShape() {
        return "Square";
    }
    }


