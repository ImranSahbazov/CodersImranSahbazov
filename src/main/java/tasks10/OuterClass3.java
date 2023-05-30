package tasks10;

public class OuterClass3 {

 class InnerClassAnonim implements Tasks10.InnerClass {

     @Override
     public void method() {
         System.out.println("override eledim ...");
     }
 }

    public static void main(String[] args) {
        OuterClass3 o3 = new OuterClass3();
        InnerClassAnonim ia = o3.new InnerClassAnonim();
        ia.method();
    }

}
