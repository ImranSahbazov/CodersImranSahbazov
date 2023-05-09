package tasks2.task2ve3;

public class task3 {
    public  Login loginGenerator(User user) {
        Login l = new Login();

        l.name = user.getName();
        l.surname = user.getSurName();
        l.age = user.getAge();
        System.out.println(l);
        return l;
    }

}
