/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */
//implement Shape interface and provide abstract method implementation
public class Rectangle implements Shape{
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    /*
    Define instance variables of rectangle as below
    Instance variables must be encapsulated
    double width
    double height
     */
    private double width;
    private double length;
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    /*
    Override area and perimeter methods here
    REMEMBER:
    Area of a rectangle can be found as => width * height
    Perimeter of a rectangle can be found as => 2 * (width + height)
    */
    @Override
    public double area() {return width * length;}
    @Override
    public double perimeter() {return (width + length) * 2;}
    //Override toString() method here
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + length +
                '}';
    }
}
