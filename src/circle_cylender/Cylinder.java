package circle_cylender;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 50;
    }

    public Cylinder(double raius, String color, double height) {
        super(raius,color);
        this.height= height;
    }
    public double getThetich(){
        return super.getArea() * height;
    }


    @Override
    public String toString() {
        return "circle_cylender.Cylinder{" +
                "height=" + height +
                '}'+ super.toString();
    }
}
