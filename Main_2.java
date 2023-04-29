import java.util.Scanner;

public class Main_2 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int t = scanner.nextInt();
while (t-- > 0) {
int n = scanner.nextInt();
String s = scanner.next();
int count = 0;
for (int i = 0; i < n - 1; i++) {
if (s.charAt(i) != s.charAt(i + 1)) {
count++;
i++;
}
}
System.out.println(count);
}
scanner.close();
}
}