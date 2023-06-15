package Tasks18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Task4 {

    public static void main(String[] args) throws Exception {
        List<Date> tarixler = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Workspace\\Intelijj\\Lesson\\src\\main\\java\\Tasks18\\Task4.txt"))) {


            String line;
            while ((line = reader.readLine()) != null) {
                Date tarix = new SimpleDateFormat("dd-MM-yyyy HH:mm").parse(line);
                tarixler.add(tarix);

            }
        }
        Collections.sort(tarixler);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        for (Date tarix : tarixler) {
            String formattedDate = dateFormat.format(tarix);
            System.out.println(formattedDate);
        }
    }
}
