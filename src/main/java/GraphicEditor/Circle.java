package GraphicEditor;

class Circle extends Shape {
    private final double PI = 3.1415926535897932384d;
    private double x;
    private double y;
    private double r;
    private double d;
    private double circleLength;


    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.d = r * 2;
        this.circleLength = d * PI;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
        this.d = r * 2;
        this.circleLength = d * PI;
    }

    public void setD(double d) {
        this.d = d;
        this.r = d / 2;
        this.circleLength = d * PI;
    }

    public void setCircleLength(double circleLength) {
        this.circleLength = circleLength;
        this.d = circleLength / PI;
        this.r = d / 2;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }


    public double getD() {
        return d;
    }


    public double getCircleLength() {
        return circleLength;
    }

    public String getShape() {
        return "Circle";
    }

}
