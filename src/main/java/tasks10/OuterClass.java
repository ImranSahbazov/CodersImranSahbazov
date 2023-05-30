package tasks10;

 class OuterClass {

    class   InnerClass{
        public void method(){
            System.out.println("inner method burdadi");
        }


    }
     public static void main(String[] args) {
         OuterClass outer = new OuterClass();
         InnerClass inner = outer.new InnerClass();
         inner.method();
     }


}
