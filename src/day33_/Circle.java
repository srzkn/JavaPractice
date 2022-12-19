package day33_;

public class Circle {
    public double radius=5;
    public double diameter;
    public static double pi=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea(double radius){
        return pi*radius*radius;
    }

    public double calcPerimeter(double radius){
        return 2*pi*radius;
    }

    public static void printPi(){
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi" + pi +
                ", area=" + calcArea(radius) +
                ", perimeter=" + calcPerimeter(radius) +
                '}';
    }
}
