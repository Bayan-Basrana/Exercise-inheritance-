public class Shape {
    private  String color;
    private boolean filled;


    Shape(){
this.color="green";
this.filled=true;
    }

    Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }

    public boolean isFilled() {
        return filled;
    }


    @Override
    public String toString() {
        return "Shape with color " + getColor() + " and "+
                (filled? "filled" :" not filled");
    }
}
