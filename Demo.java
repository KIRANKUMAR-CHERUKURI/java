import java.util.Scanner;
public classdemo{
public static void main(String[] args) { 
  Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number:");
    int i = sc.nextInt();
     System.out.println("Enter an index value :");
    int index = sc.nextInt();
    try {
        if(i<5){
        System.out.println("index  " + i);
}
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Error");
    }
    
    sc.close();
}

    
   
   
