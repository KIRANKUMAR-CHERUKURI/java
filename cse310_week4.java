import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String k=sc.next();
        System.out.println(join(n,k));
        
    }
    static String join(String n,String k)
    {
        int z=n.length();
        int y=z/2;
        StringBuffer res=new StringBuffer(n);
        res.insert(y,k);
        return res.toString();
    }
}
