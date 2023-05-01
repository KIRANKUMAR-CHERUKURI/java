import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // Read input string from user
    java.util.Scanner sc = new java.util.Scanner(System.in);
    String input = sc.nextLine();
    sc.close();

    // Check length of input string
    if (input.length() <= 5) {
      System.out.println("Invalid Input");
      return;
    }

    // Convert input string to char array and sort it
    char[] chars = input.toCharArray();
    Arrays.sort(chars);

    // Count occurrences of each character
    StringBuilder result = new StringBuilder();
    char prev = chars[0];
    int count = 1;
    for (int i = 1; i < chars.length; i++) {
      if (chars[i] == prev) {
        count++;
      } else {
        result.append(prev);
        result.append(count);
        prev = chars[i];
        count = 1;
      }
    }
    result.append(prev);
    result.append(count);

    // Display result
    System.out.println(result.toString());
  }
}
