import java.time.LocalDate;

public class MyPersonalInfoCard {

    public static void main(String[] args) {

        String name = "Deepak";
        int age = 20;
        String fatherName = "Kailash Sharma";
        String motherName = "Pushplata Sharma";
        LocalDate dateOfBirth = LocalDate.of(2007, 5, 12);
        String bloodGroup = "B+";
        long mobileNumber = 1234567890L;
        String email = "deepaksharma@example.com";
        String address = "123 Main Street, City, Country";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Mother's Name: " + motherName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }
}