package tasks5;

public class duzbucaqli extends forma{

    private int uzunluq;
    private int genislik;


    public duzbucaqli(int uzunluq,int genislik){
        this.uzunluq=uzunluq;
        this.genislik=genislik;
    }

    @Override
    public int getPerimetr() {
        return 2*(uzunluq+genislik);
    }

    @Override
    public int getSahe() {
        return uzunluq*genislik;
    }
}
