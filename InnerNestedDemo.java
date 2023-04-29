class outer
{
  static int o_x=10;
  int o_y=20;
 private int o_z=30;
class inner
{
 void display()
   {
     System.out.println(o_x);
     System.out.println(o_y);
     System.out.println(o_z);
   }
 }
}
class InnerNestedDemo
{
  public static void main(String[] args)
  {
     outer obj1=new outer();
     outer.inner obj2= obj1.new inner();
obj2.display();
System.out.println(obj1.o_y);
     //System.out.println(o_z);
}
}