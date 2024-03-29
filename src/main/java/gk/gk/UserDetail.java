package gk.gk;

public class UserDetail {
    private String email;

    private String firstName;

    private String lastName;

    private String userId;

    public UserDetail(String email, String firstName, String lastName, String userId) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
    }

    public UserDetail() {
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
