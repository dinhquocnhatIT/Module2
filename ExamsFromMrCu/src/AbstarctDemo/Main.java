package AbstarctDemo;

import AbstarctDemo.Animal.Animal;
import AbstarctDemo.Animal.Bird;
import AbstarctDemo.Animal.Dog;
import AbstarctDemo.Animal.Fish;
import AbstarctDemo.Machine.Car;
import AbstarctDemo.Machine.Machine;
import AbstarctDemo.Machine.Plane;

public class Main {
    public static void main(String[] args) {


        Animal animal2 = new Fish("meo");
        animal2.toString();
        Animal animal = new Dog("haha");
        animal.toString();

        Animal animal3 = new Bird("cho tirn");
        animal3.toString();
        //machine
        Machine machine = new Car();
        Machine machine1 = new Plane();


    }
}

