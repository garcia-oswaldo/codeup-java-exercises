package shapes;

public class Square extends Quadrilateral{

    protected Square (int side){
        super(side, side);
    }
    @Override
    public double getArea(){
        return super.length * super.width;
    }
    @Override
    public double getPerimeter(){
        return 4 * super.length;
    }
}
