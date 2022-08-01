package AbstarctDemo.Machine;

import AbstarctDemo.Interfaceabble.Flyable;

public class Plane extends Machine implements Flyable {
    @Override
    void start() {
        System.out.println("may bay cat canh");
    }

    @Override
    public void fly() {
        System.out.println("may bay bay tren troi nhu chim luon nek");
    }
}
