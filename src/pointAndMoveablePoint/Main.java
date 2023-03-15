package pointAndMoveablePoint;

public class Main {
    public static void main(String[] args) {
        System.out.println("Point>>>>>>>>>>>");
        Point p = new Point();
        System.out.println(p);
        Point p2 = new Point(5,20);
        System.out.println(p2);
        System.out.println("MoveablePoint>>>>>>");
        MoveablePoint mp = new MoveablePoint();
        System.out.println(mp);
        MoveablePoint mp1 = new MoveablePoint(5,10,15,20);
        System.out.println(mp1);
    }
}
