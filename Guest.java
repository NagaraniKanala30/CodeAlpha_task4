package hotelreservation;

public class Guest {
    private String name;
    private int age;
    private String gender;
    private String nationality;
    private String phoneNumber;
    private String emailAddress;

    public Guest(String name, int age, String gender, String nationality, String phoneNumber, String emailAddress) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Guest [Name=" + name + ", Age=" + age + ", Gender=" + gender + ", Nationality=" + nationality
                + ", Phone=" + phoneNumber + ", Email=" + emailAddress + "]";
    }
}


