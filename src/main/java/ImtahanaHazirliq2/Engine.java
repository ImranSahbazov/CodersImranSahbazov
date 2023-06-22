package ImtahanaHazirliq2;

public class Engine {
    int horsePower;

    public Engine(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public Engine setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }
}
