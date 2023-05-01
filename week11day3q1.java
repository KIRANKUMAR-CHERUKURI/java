import java.util.Scanner;

public class WordFormationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.nextLine().trim();
        String word2 = sc.nextLine().trim();

        if (word1.length() < 3 || word2.length() < 3) {
            System.out.println("ERROR");
        } else if (word1.substring(0, 3).equals(new StringBuilder(word2.substring(word2.length() - 3)).reverse().toString())) {
            System.out.println("GREAT");
        } else {
            System.out.println("TRY NEXT TIME");
        }
    }
}
