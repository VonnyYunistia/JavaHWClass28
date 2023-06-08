package HWClass28Java;

public class Task1 {

    public static void main(String[] args) {

        int age = 14;
        String username = "Vonny";

        try {
            checkAgeEligibility(age);
            System.out.println("Age is valid");
        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            checkUserName(username);
            System.out.println("Username is valid");
        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkAgeEligibility(int age) {
        if (age < 16) {
            throw new RuntimeException("Age is less than 16");
        }
    }

    public static void checkUserName(String username) {
        if (username.length() < 5) {
            throw new RuntimeException("Username is less than 5 characters");
        }














    }


}
