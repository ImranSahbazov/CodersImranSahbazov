package ImtahanaHazirliq4;

public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.setMyNumber(3);

        myObject.validateFields();

        System.out.println("myNumber: " + myObject.getMyNumber());
    }
}