package homeWork1;

public class UserInfo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No user information provided.");
            return;
        }
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        String email = args[2];
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}
