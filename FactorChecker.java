import java.util.function.BiPredicate;

public class FactorChecker {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isFactor = (num, factor) -> num % factor == 0;
        
        int num = 12;
        int factor = 3;
        
        if (isFactor.test(num, factor)) {
            System.out.printf("%d is a factor of %d", factor, num);
        } else {
            System.out.printf("%d is not a factor of %d", factor, num);
        }
    }
}
