import java.util.Scanner;
class ExceptionHandlingDemo
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a,b;
a=sc.nextInt();
b=sc.nextInt();
try
{
try
{
int answer= a/b;
System.out.println("Result: "+answer);
}
catch(ArithmeticException e)
{
System.out.println("Denominator is Zero");
}

try
{
int arr[]= new int[5];
arr[5]=10;
}
catch(ArrayIndexOutOfBoundsException x)
{
System.out.println("The size of the array is 5");
}

try
{
String num=null;
System.out.println(num.charAt(0));
}
catch(NullPointerException x)
{
System.out.println("String is null");
}
}
catch(Exception y)
{
System.out.println("Exception Alert");
}
System.out.println("End");
}
}
