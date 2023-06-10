package Tasks16;

public class Task3Student {
    private String name;
    private String surname;
    private int age;
    private String groupName;

    public Task3Student() {
    }

    public Task3Student(String name, String surname,int age, String groupName) {
        this.name = name;
        this.surname = surname;
        this.age=age;
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public Task3Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Task3Student setAge(int age) {
        this.age = age;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Task3Student setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public Task3Student setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    @Override
    public String toString() {
        return "Task3Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
