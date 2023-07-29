package tasks27;

class EkranObserver implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Ekran: Hava məlumatları yeniləndi.");
        System.out.println("Istilik: " + temperature + "°C");
        System.out.println("Nəm: " + humidity + "%");
        System.out.println("Təzyiq: " + pressure + " hPa");
    }
}

class LogObserver implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Log faylı: Hava məlumatları yeniləndi.");
        System.out.println("Istilik: " + temperature + "°C");
        System.out.println("Nəm: " + humidity + "%");
        System.out.println("Təzyiq: " + pressure + " hPa");
    }
}
