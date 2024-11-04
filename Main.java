//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //test program to test all the methods defined in Shape.

Shape shape=new Shape("blue",false);

        System.out.println(shape.toString());
        System.out.println("***********************************");
        //test program to test all the methods defined in Circle.
Circle circle1=new Circle(5,"red",true);

 System.out.println("th Area of the circle " +circle1.getAres());
 System.out.println("th Perimeter of th circle " +circle1.getPerimeter());
        System.out.println(circle1.toString());
        System.out.println("***********************************");

        //test program to test all the methods defined in Rectangle.
        System.out.println();

 Rectangle rectangle=new Rectangle(5,9,"pink",true);
        System.out.println("th Area of the Rectangle " +rectangle.getArea());
        System.out.println("th Perimeter of th Rectangle " +rectangle.getPerimeter());
        System.out.println(rectangle.toString());

        System.out.println("***********************************");

        //test program to test all the methods defined in Square.
        System.out.println();
Square square= new Square(2,"black",true);
        System.out.println("The sid=" + square.getSide());
        System.out.println("th Area of the square " + square.getArea());
        System.out.println("th Perimeter of th square " +square.getPerimeter());
        System.out.println(square.toString());

    }
}