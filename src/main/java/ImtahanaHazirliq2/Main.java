package ImtahanaHazirliq2;

public class Main {
    public static void main(String[] args) {
        Engine e = new Engine(950);
        Car c = new Car("BMW", e);

        System.out.println("Car brand: " + c.getBrand());
        System.out.println("Car engine: " + c.getEngine().getHorsePower());
    }
}
