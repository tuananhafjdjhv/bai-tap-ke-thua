package circle_cylender;

public class Main {
    public static void main(String[] args) {
        Test("-------------circle_cylender.Circle----------");
        Circle cc = new Circle();
        System.out.println(cc);
        Circle cc1 = new Circle(5.0,"yelow");
        System.out.println(cc1.getArea());
        System.out.println(cc1);
        Test("---------circle_cylender.Cylinder-----------");
        Cylinder cld = new Cylinder();
        System.out.println(cld);
        Cylinder cld1 = new Cylinder(2.0,"red",30);
        System.out.println(cld1);
        System.out.println(cld1.getThetich());

    }
    public static void Test(String x){
        System.out.println(x);
    }
}
