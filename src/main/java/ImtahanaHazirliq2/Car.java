package ImtahanaHazirliq2;

public class Car {
    private String brand;
    private Engine engine;



    public Car(String brand, Engine engine) {
        this.brand = brand;
       this.engine=engine;
    }

    public String getBrand() {
        return brand;
    }

    public Car setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }
}
