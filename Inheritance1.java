import java.util.Scanner;
class University
{
  int reg;
University()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Registration no: ");
reg=sc.nextInt();
}
 void print()
{
System.out.println("Registration Number:"+reg);
      
   }

}
class details extends University
{
  String name;
  char grade;
  Details(int a, String b, charc)
{
  System.out.println("Details of the constractor");
  reg=a;
  name=b;
  grade=c;
  }

void print(){
 super.print();
 System.out.println("Name:"+name);
 System.out.println("Grade:"+grade);
    }
  
}
class Inheritance1
{
 public static void main(String args[])
   {
       Details d=new Details(1,"xyz",'a');
       d.print();
  }
}
