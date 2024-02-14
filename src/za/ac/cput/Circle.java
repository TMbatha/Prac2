package za.ac.cput;

/**
 * Circle.java 12/02/2024
 *
 * @author Thabiso Mbatha
 */
public class Circle {

    private double radius;

    public Circle() {

    }

    public Circle(double inRadius) {
        this.radius = inRadius;
    }

    public void setRadius(double inRadius) {
        this.radius = inRadius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getCircumference() {
        return 2 * 3.142 * radius;
    }

    public double getArea() {
        return 3.142 * Math.pow(radius, 2);
    }
    
    @Override
    public String toString(){
        return "***CIRCLE*** \n \n"
                + "Radius = \t\t" + radius + "\n"
                + "Diameter = \t\t" + getDiameter() + "\n"
                + "Circumference = \t\t" + getCircumference() + "\n"
                + "Area = \t\t" + getArea() + "\n";
    }
}
