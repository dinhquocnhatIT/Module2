package AbstarctDemo.Animal;

import AbstarctDemo.Interfaceabble.Flyable;

public class Bird extends Animal  implements Flyable {


    public Bird(String name) {
        super(name);
    }

    @Override
    void eat() {

        System.out.println("chim: an hat");
    }

    @Override
    public void fly() {

        System.out.println("chim bay nhanh lam");
    }

    @Override
    public String toString() {
        System.out.println(getName() + " is a bird");
        eat();
        fly();
        return super.toString();
    }
}
