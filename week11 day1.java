import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ntr = sc.nextInt();
        if (ntr < 2) {
            System.out.println("Invalid");
            return;
        }
        String[] arr = new String[ntr];
        for (int i = 0; i < ntr; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
