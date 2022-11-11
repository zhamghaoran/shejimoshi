package org.example;


public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}
class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1)
            drawRectangle(s);
        if (s.m_type == 2)
            drawCircle(s);
        if (s.m_type == 3)
            drawTriangle(s);
    }
    public void drawRectangle(Shape r) {
        System.out.println("绘制矩形");
    }
    public void drawCircle(Shape r) {
        System.out.println("绘制圆形");
    }
    public void drawTriangle(Shape r) {
        System.out.println("绘制三角形");
    }

}
class Shape {
    public int m_type;
}
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}