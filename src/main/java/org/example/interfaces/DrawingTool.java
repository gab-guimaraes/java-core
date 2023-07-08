package org.example.interfaces;

/*
supposed to we're creating a drawing software that have two tools: pencil and brush.
 Both of them can draw a curve. So we create an interface DrawingTool
 and two classes Pencil and Brush that implement this interface.
 */
 interface DrawingTool {
    void draw(Curve curve);
}

class Curve { }

class Pencil implements DrawingTool {
    @Override
    public void draw(Curve curve) {
        System.out.println("Pencil");
    }
}

class Brush implements DrawingTool {
    @Override
    public void draw(Curve curve) {
        System.out.println("Brush");
    }
}
