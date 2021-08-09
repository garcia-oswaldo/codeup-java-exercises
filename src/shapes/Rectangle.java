package shapes;

public class Rectangle extends Quadrilateral  {

    public Rectangle(int width, int length) {
        super.width = width;
        super.length=length;
    }
    public double getArea(){
        return length* width;
    }
    public double getPerimeter(){
        return (2 * length) + ( 2 * width);
    }
}
