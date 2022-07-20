package car;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Porsche", "doi vua Hung");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Porsche", "doi vua Franklin");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("Porsche", "doi vua Zeus");
        System.out.println(Car.numberOfCars);

    }
}
