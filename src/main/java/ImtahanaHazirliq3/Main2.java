package ImtahanaHazirliq3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Employer> listEmp = new ArrayList<>();
        listEmp.add(new Developer("Imran"));
        listEmp.add(new Manager("Ilkin"));
        listEmp.add(new Tester("Cavid"));

        listEmp.sort(Comparator.comparing(Employer::getName));

        for(Employer emp : listEmp){
            System.out.println("Name = "+ emp.getName()+"   Title = "+emp.getJobTitle());
        }

    }
}
