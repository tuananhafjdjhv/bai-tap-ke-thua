package shape_triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Shape>>>>>>");
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("red",false);
        System.out.println("Triangle>>>>>...");
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        Triangle triangle1 = new Triangle("blue",false,3,3,3);
        System.out.println(triangle1);
        System.out.println("chu vi la: "+triangle.getPerimeter());
        System.out.println("dien tich la: "+triangle.getArea());

    }
}
