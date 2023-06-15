package Tasks18;

import java.io.FileReader;

public class Task1 {
    public static void main(String[] args) throws Exception{
        try(var a = new FileReader("C:\\Workspace\\Intelijj\\Lesson\\src\\main\\java\\Tasks18\\file.txt")){
            int chr=0;
            while((chr=a.read()) !=-1){
                System.out.print((char)chr);
            }
        }
    }
}
