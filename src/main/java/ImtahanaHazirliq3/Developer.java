package ImtahanaHazirliq3;

public class Developer extends Employer{

    Developer(String name){
        super(name);
    }
    @Override
    String getJobTitle() {
        return "Developer";
    }
}
