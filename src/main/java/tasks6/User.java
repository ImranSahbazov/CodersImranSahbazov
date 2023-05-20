package tasks6;

public class User {
    private String email;
    private String password;


    public String getEmail() {
        return email;
    }

    public User() {
    }

    public User(String email, String password) throws wrongEmailException, wrongPasswordException {
        if (!email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            throw new wrongEmailException();
        } else {
            this.email = email;
        }
        if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")) {
            throw new wrongPasswordException();
        } else {
            this.password = password;
        }
    }



    public String getPassword() {
        return password;
    }




    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
