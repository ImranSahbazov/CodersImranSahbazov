package tasks3.task1;

public class rectangleTest {
    public static void main(String[] args) {
        rectangle r = new rectangle(3, 4);
        rectangle r2 = new rectangle(5);

        System.out.println("width= " + r.getWith() + "  height= " + r.getHeight());
        System.out.println("width= " + r2.getWith() + "  height= " + r2.getHeight());


    }
}
