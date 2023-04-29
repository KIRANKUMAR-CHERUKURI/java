import java.util.function.Function;

public class reversed {
public static void main(String[] args) {
String str = "reverse";
System.out.println("str: " + str);

Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString();
String output = reverseString.apply(str);
System.out.println("Output: " + output);
}
}