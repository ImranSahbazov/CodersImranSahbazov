package tasks10;

public class OuterClass1 {
    public void OuterClassMethod(){

        class InnerClass{
            public void innerClassMehod(){
                System.out.println("inner method burdadi...");
            }
        }
        InnerClass in = new InnerClass();
        in.innerClassMehod();

    }

    public static void main(String[] args) {
        OuterClass1 o1 = new OuterClass1();
        o1.OuterClassMethod();
    }

}
