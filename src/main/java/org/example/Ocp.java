package org.example;


public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}
class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }

}
abstract class Shape {
    public int m_type;
    public abstract void draw();
}
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
class OtherGraphic extends Shape {

    OtherGraphic() {
        super.m_type = 4;
    }
    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}