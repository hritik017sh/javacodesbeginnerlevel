package OperatorAndExpression_4;
import java.util.*;

public class function {
    public static void fullname(String fname)
    {
        System.out.println(fname+" Sharma");
    }
    public static void sum()
    {
        Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=a+b;
      System.out.println(c);
    }

    public static int recursion(int start,int end)
    {
        if(end>start) {
            return end + recursion(start,end-1);
        }
        else
            return end;
    }
    public static void main(String[] args)
    {
//        fullname("Hritik");
//        fullname("Naveen");
//        fullname("Tanuja");
//        fullname("Sweta");
//        sum();
        int mynum=recursion(5,10);
        System.out.println(mynum);

    }


}
