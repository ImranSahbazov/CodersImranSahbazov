package tasks5;

public class main {
    public static void main(String[] args) {
        kvadrat kv= new kvadrat(5);
        System.out.println("kvadratin perimetri: "+kv.getPerimetr());
        System.out.println("kvadratin sahesi: "+kv.getSahe());


        duzbucaqli dc = new duzbucaqli(8,4);
        System.out.println("duzbucaqlinin perimetri: "+dc.getPerimetr());
        System.out.println("duzbucaqlinin sahesi: "+dc.getSahe());
    }
}
