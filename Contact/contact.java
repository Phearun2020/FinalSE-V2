package Contact;

public class contact {
    private String fristName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public contact(String firstName, String lastName, String phoneNumber, String email) {
        this.fristName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString(){
        return "\nFirst name: " + fristName +
                ", Last name: " + lastName +
                ", Phone number: " + phoneNumber +
                ", Email: " + email;
    }

    public String getNumber() {
        return toString();
    }

    public void setFristName(String firstName) {
        this.fristName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
