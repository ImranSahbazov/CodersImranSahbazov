package tasks5;

public class kvadrat extends forma{

    private int kenar;

    public kvadrat(int kenar){
        this.kenar=kenar;
    }



    @Override
    public int getPerimetr() {

        return kenar*4;
    }

    @Override
    public int getSahe() {
        return kenar*kenar;
    }
}
