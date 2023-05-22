package tasks7;

public class task5 {
   private String name;
    private task5 subfolder;


    public task5() {
    }

    public task5(String name, task5 subfolder) {
        this.name = name;
        this.subfolder = subfolder;
    }



    @Override
    public String toString() {
        return "Folder{" +
                "name='" + name + '\'' +
                ", subfolder=" + subfolder +
                '}';
    }
}
