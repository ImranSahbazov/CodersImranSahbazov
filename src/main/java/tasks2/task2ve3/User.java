package tasks2.task2ve3;

public class User {
    private String name;
    private String surName;
    private int age;

    public String getName() {
        return name;
    }

    public User setName(String name) {
       if(containSymbols(name) || name.length()<3){
           System.out.println("simvollardan istifade qadagandir ve en az uc herfden istifade olunmalidir");
       }else{
           this.name=name;
       }
        return this;
    }

    public String getSurName() {
        return surName;
    }

    public User setSurName(String surName)  {
        if(containSymbols(surName) || surName.length()<3){
            System.out.println("simvollardan istifade qadagandir ve en az uc herfden istifade olunmalidir");
        }else{
            this.surName=surName;
        }
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        if(age<18){
            System.out.println("18 yasdan kicikler ucun nezerde tutulmayib");
        }else {
            this.age = age;
        }
        return this;
    }

    private boolean containSymbols(String input){
        String symbolPattern = "[^a-zA-Z0-9 ]";
        return  input.matches(".*" + symbolPattern + ".*");
    }
}
