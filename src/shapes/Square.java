package shapes;

public class Square extends Rectangle{

    public Square (int side){
        super(side, side);
    }
    @Override
    public int getArea(){
        return super.length * super.width;
    }
    @Override
    public int getPerimeter(){
        return 4 * super.length;
    }
}
