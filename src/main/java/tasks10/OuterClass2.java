package tasks10;

public class OuterClass2 {


     static class InnerClass {

        public void method(){

            System.out.println("statik inner klas burdadir...");
        }
    }

    public static void main(String[] args) {
        InnerClass in = new InnerClass();
        in.method();
    }

}
