package ImtahanaHazirliq3;

public abstract class Employer {

    private String name;

    public Employer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    abstract String getJobTitle();
}
