package equalsDemo.animal;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Heo",1);
        Animal animal2 = new Animal("Heo",1);
        Animal animal3 = new Animal("Vit",1);
        Animal animal4 = new Animal("Vit",1);
        System.out.println(animal1.equals(animal2));
        System.out.println();


        //Set chua co hashCode se luu 2 gia tri khac nhau cho du chung co cung thuoc tinh
        Set<Animal> AnimalSet = new HashSet<>();
        AnimalSet.add(animal1);
        AnimalSet.add(animal2);
        AnimalSet.add(animal3);
        AnimalSet.add(animal4);
        for (Animal animal : AnimalSet) {
            System.out.println(animal);
        }
    }
}
