package tasks3.task1;

public class rectangle {
    private double with;
    private double height;

    public rectangle(double with, double height) {
        this.with = with;
        this.height = height;
    }
public  rectangle(double sidlength){
        this(sidlength,sidlength);
}
    public double getWith() {
        return with;
    }

    public rectangle setWith(double with) {
        this.with = with;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public rectangle setHeight(double height) {
        this.height = height;
        return this;
    }

}
