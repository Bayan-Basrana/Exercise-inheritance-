public class Circle extends Shape{
    private  double radius;

    Circle(){
        super();
        this.radius=1.0;

    }
    Circle(double radius){
        super();
        this.radius=radius;
    }

    Circle(double radius,String color,boolean filled){
        super(color,filled);
this.radius=radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getAres(){
        return radius* radius *3.14159;
    }

    public double getPerimeter(){
        return 2*3.14159*radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "+radius+ " which is a subclass of "
               + super.toString();
    }
}
