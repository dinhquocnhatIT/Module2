public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;

    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private  String color = "blue";

    //constructor
    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()) {
          return  String.format("Speed: %d\nColor: %s\nRadius: %.1f\n fan is on\n",getSpeed(),getColor(),getRadius());
        }
        return String.format("Color: %s\nRadius: %.1f\n fan is off",getColor(),getRadius());
    }
}
