import java.util.Locale;

public class User {

    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String output() {
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }

    public String output(boolean showLastName) {
        if (showLastName) {
            return output();
        }
        return firstName;
    }
}
