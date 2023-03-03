import model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Počet aut: " + Car.getNumberOfExistingCars());
        Car car1 = new Car("Volkswagen", "Polo", 2010);
        System.out.println(car1);
        System.out.println("Počet aut: " + Car.getNumberOfExistingCars());
        Car car2 = new Car("Chevrolet", "Corvette", 1980);
        System.out.println(car2);
        System.out.println("Počet aut: " + Car.getNumberOfExistingCars());
    }
}