package Tasks16;

import Tasks16.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Imran","Sahbazov",20);
        Student s2 = new Student("Ilkin","Sahbazov",26);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);


       Optional<Student> opt = list.stream().max( (a1, a2)->Integer.compare(a1.getAge(),a2.getAge()));
        System.out.println(opt);
    }
}

