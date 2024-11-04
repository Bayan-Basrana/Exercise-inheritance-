public class Square extends Rectangle{

    Square(){
        super();
    }
    Square(double side){
        super(side,side);
    }

    Square (double side,String color,boolean filled){
        super(side,side,color,filled);
    }

    public void setSide (double side){
        super.setWidth(side);
    }
    public double getSide (){
        return getWidth();
    }

    public String toString() {
        return "A Square with side= "+getSide()+ " which is a subclass of "
                + super.toString();
    }
}
