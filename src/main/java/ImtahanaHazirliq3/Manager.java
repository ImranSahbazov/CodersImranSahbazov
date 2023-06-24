package ImtahanaHazirliq3;

public class Manager extends Employer{

    Manager(String name){
        super(name);

    }
    @Override
    String getJobTitle() {
        return "Manager";
    }
}
