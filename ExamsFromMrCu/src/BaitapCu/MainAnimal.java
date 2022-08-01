package BaitapCu;

public class MainAnimal {
    public static void main(String[] args) {
        Animal ame = new Animal("Truc","duc","den",22,88,150);


        System.out.println(ame.getName());
        System.out.println(ame.getGender());
        ame.makeSound();

        //setter
        ame.setName("\nHuy");
        System.out.println(ame.getName());
    }
}
