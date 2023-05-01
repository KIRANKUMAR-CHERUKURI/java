import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String statement = sc.nextLine();
        
        int k = sc.nextInt();
        
        if (k < 1 || k > 10) {
            System.out.println("Invalid Input");
            return;
        }
        
        String[] wordss = statement.split(" ");
        
        int count = 0;
        for (String word : wordss) {
            if (word.length() == k) {
                count++;
            }
        }
        
        System.out.println(""  + count);
    }

}
