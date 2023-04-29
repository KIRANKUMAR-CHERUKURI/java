import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        try {
            if (input.isEmpty()) {
                throw new Exception("Empty String");
            }
            System.out.println("Length of the string: " + input.length());
            System.out.println("First character of the string: " + input.charAt(0));
            System.out.println("Last character of the string: " + input.charAt(input.length() - 1));
            System.out.println("Substring from index 1 to index 4: " + input.substring(1, 5));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
