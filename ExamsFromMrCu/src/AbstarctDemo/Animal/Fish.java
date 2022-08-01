package AbstarctDemo.Animal;

import AbstarctDemo.Interfaceabble.Swimable;

public class Fish extends Animal  implements Swimable {
    public Fish(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("ca an thit");
    }

    @Override
    public void swim() {
        System.out.println("ca  vang: bboi trong be nuoc");
    }
}
