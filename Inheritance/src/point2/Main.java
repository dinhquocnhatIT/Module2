package point2;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(7);
        point.setY(9);
        System.out.println(point);

        point.setXY(2,1);
        System.out.println(point);
        //movable
        System.out.println("******* Movable Point *****");
         MovablePoint movable = new MovablePoint();
         movable.setX(4);
         movable.setY(6);
         movable.setxSpeed(3);
         movable.setySpeed(2);
        System.out.println(movable);
        System.out.println("move: ");
        System.out.println(movable.move());
    }
}
