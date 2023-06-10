package Tasks16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task3Main {

    public static void main(String[] args) {


        List<Task3Student> Students = new ArrayList<>();

        Students.add(new Task3Student("imran", "sahbazov", 20, "qrup1"));
        Students.add(new Task3Student("ilkin", "sahbazov", 20, "qrup1"));
        Students.add(new Task3Student("azer", "caniyev", 20, "qrup3"));
        Students.add(new Task3Student("tagi", "firudinov", 20, "qrup3"));
        Students.add(new Task3Student("rustem", "mashabov", 20, "qrup5"));

        Map<String, List<Task3Student>> groupedStudents = Students.stream()
                .collect(Collectors.groupingBy(Task3Student::getGroupName));
        System.out.println(groupedStudents);



    }
}