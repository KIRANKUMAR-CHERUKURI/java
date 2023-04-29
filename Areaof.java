import java.util.Scanner;
class Shape
{
double dim1,dim2;
//double dim2;
//double dim3;
 public Shape(double a, double b)
{
this.dim1 = a;
 this.dim2 = b;
}
public void printArea() 
	{
		//area=dim1*dim2;
		System.out.println("area:" );
            return(1.1);
	}
}
 class rectangle extends Shape
{
 public rectangle(double dim1,double dim2)
{
super(dim1,dim2);
}
public void printArea() 
{
	 double area=dim1*dim2*10;
	System.out.println("area of rectangle:" +area);
}

}
 class triangle extends Shape
{
 public triangle(double dim1,double dim2 )
{	
super(dim1,dim2);
}
public void printArea()
{
	 double area= 0.5*dim1*dim2;
	System.out.println("area of triangle:" +area);
}
}
class Areaof
{
	public static void main(String args[])
	{
		Shape s1 = new Shape(2.1, 6.3);
        s1.printArea();
		triangle t1 = new triangle(10,20);
		t1.printArea();
		//d1.print();
		rectangle r1 = new rectangle(10,5);
		r1.printArea();
	}
}