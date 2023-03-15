package circle_cylender;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle(){
        this.radius=10;
        this.color="blue";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "circle_cylender.Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    protected double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
