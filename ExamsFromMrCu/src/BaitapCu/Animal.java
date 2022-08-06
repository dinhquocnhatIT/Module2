package BaitapCu;

public class Animal {
    private int id;
    private String name;
    private String gender;
    private String color;
    private int age;
    private double weight;
    private double height;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //constructor
    public Animal(String name, String gender, String color, int age, double weight, double height) {
        this.name = name;
        this.gender = gender;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //getter
    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //methods
    public void makeSound() {
        System.out.println("hello! mother f****");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
