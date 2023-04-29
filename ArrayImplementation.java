import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            System.out.print("Enter the size of the array: ");
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Array size must be numeric");
            System.exit(0);
        }
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index of the array element to display: ");
        int index = sc.nextInt();
        try {
            if (index >= n) {
                throw new ArrayIndexOutOfBoundsException();
            }
            for (int i = 0; i <= index; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
}
