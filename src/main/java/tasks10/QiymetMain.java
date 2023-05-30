package tasks10;



public class QiymetMain {



    public static void main(String[] args) {
        QiymetEnum q= QiymetEnum.D;
        int a = 100;






        switch(a/10){
            case 10:
                System.out.println(QiymetEnum.A);
                break;
            case 9 :
                System.out.println(QiymetEnum.A);
                break;
            case (8):
                System.out.println(QiymetEnum.B);
                break;
            case (7):
                System.out.println(QiymetEnum.C);
                break;
            case (6):
                System.out.println(QiymetEnum.D);
                break;
            case (5):
                System.out.println(QiymetEnum.E);
                break;
            default:
                System.out.println(QiymetEnum.F);
                break;
        }
    }
}
