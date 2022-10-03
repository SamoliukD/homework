package GraphicEditor;

class Rectangle extends Shape {
    private double x;
    private double y;
    private double sideA;
    private double sideB;
    private double p;
    private double area;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.p = 2 * (sideA + sideB);
        this.area = sideA * sideB;

    }

    public Rectangle(double x, double y, double sideA, double sideB) {
        this(sideA, sideB);
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

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
        this.p = 2 * (sideA + sideB);
        this.area = sideA * sideB;

    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
        this.p = 2 * (sideB + sideA);
        this.area = sideA * sideB;
    }

    public double getP() {
        return p;
    }

    public double getArea() {
        return area;
    }

    public String getShape() {
        return "Rectangle";
    }
}


