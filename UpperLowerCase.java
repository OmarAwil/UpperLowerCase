import java.util.Scanner;

public class UpperLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        System.out.println(str.toUpperCase() + str.toLowerCase());

        scanner.close();
    }
}
