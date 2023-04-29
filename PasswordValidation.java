import java.util.Scanner;

public class PasswordValidation {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your password: ");
String password = scanner.nextLine();

try {
if (password.length() < 8) {
throw new Exception("Password must be at least 8 characters long.");
}

boolean containsNumber = false;
for (int i = 0; i < password.length(); i++) {
if (Character.isDigit(password.charAt(i))) {
containsNumber = true;
break;
}
}

if (!containsNumber) {
throw new Exception("Password must contain at least one number.");
}

System.out.println("Password validated successfully.");

} catch (Exception e) {
System.out.println("Password validation error: " + e.getMessage());
}
}
}