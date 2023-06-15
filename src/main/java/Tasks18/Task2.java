package Tasks18;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Task2 {
    public static void main(String[] args) throws Exception {
        int chr=0;
        StringBuilder s = new StringBuilder();
        try(var a = new FileReader("C:\\Workspace\\Intelijj\\Lesson\\src\\main\\java\\Tasks18\\file.txt")){

            while((chr=a.read()) !=-1){
                s.append((char) chr);

            }
        }
        System.out.println(s);
        try(FileWriter myWriter = new FileWriter("C:\\Workspace\\Intelijj\\Lesson\\src\\main\\java\\Tasks18\\newFile.txt");){
            myWriter.write(s.toString());

        }
    }
}
