package AbstarctDemo.Animal;

import AbstarctDemo.Interfaceabble.Barkabble;
import AbstarctDemo.Interfaceabble.Runnable;

public class Dog extends Animal implements Barkabble, Runnable {

    public Dog(String name) {
        super(name);
    }

    @Override
    void eat() {

        System.out.println("an roi  ngoi sua");
    }



    @Override
    public void bak() {

        System.out.println("an roi ngoi sua");
    }

    @Override
    public void run() {
        System.out.println("cho chay ");
    }

    @Override
    public String toString() {
        System.out.println(getName() + " is a dog ");
        eat();
        run();
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
