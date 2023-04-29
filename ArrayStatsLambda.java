import java. util.Arrays;

public class ArrayStatsLambda {

    public static void main(String[] args) {
        int[] nums = { 5, 10, 15, 20, 25 };

        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        int sum = Arrays.stream(nums).sum();
        double avg = Arrays.stream(nums).average().getAsDouble();

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Sum of all values: " + sum);
        System.out.println("Average of all values: " + avg);
    }
 
}
