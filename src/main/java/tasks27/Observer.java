package tasks27;

interface Observer {
    void update(float temperature, float humidity, float pressure);
}

interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

