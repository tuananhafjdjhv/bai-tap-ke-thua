package poin2D_poin3D;

public class Main {
    public static void main(String[] args) {
        System.out.println("----Poin2D");
        Poin2D p2D = new Poin2D();
        System.out.println(p2D);
        Poin2D p2D1 = new Poin2D(10,30);
        System.out.println(p2D1);
        System.out.println("----Poin3D");
        Poin3D p3D = new Poin3D();
        System.out.println(p3D);
        Poin3D p3D1 = new Poin3D(10,20,30);
        System.out.println(p3D1);
    }
}
