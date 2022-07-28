public class Main {
    public static void main(String[] args) {
        double percent = Math.random()*100 + 1;
        Circle[] cr = new Circle[3];
        cr[0] = new Circle(2);
        cr[1] = new Circle(4);
        cr[2] = new Circle(6);
        System.out.println("trc khi resize");
        for (Circle c : cr) {
            System.out.println(c);
        }
        System.out.println("sau khi resize");
        for (Circle c : cr) {
           c.resize(percent);
            System.out.println(c);
        }
    }
}

