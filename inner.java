// inner class
class A   //outer
{
 int age;
 public void show()
{
 System.out.println("A class fn");
}
static class B   //inner
{
 public void config()
{
 System.out.println("B class fn");
}}}
class c
{
public static void main(String[] args)
{
A obj=new A();
obj.show();
A.B obj1=new A.B();
obj.config();
}}