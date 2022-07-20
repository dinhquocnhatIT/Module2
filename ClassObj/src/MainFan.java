public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        System.out.println(fan1.toString());
        //fan 2
        Fan fan2 = new Fan();
        fan2.setOn(false);
        fan2.setSpeed(fan2.medium);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        System.out.println(fan2.toString());
    }
}
