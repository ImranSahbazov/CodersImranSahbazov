package tasks27;

public class Main3 {
    public static void main(String[] args) {
        HavaStansiya stansiya = new HavaStansiya();
        EkranObserver eo = new EkranObserver();
        LogObserver lo = new LogObserver();
        stansiya.addObserver(eo);
        stansiya.addObserver(lo);

        stansiya.removeObserver(eo);

        stansiya.setMeasurements(25.5f, 60.2f, 1013.3f);
    }
}
