package GraphicEditor;

import java.awt.*;

import static java.util.stream.Stream.generate;

class Quad extends Shape {

    private float width;
    private float height;

    public Quad(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String getShape() {
        return "Quad";
    }
}



