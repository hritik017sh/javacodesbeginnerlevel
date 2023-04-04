package OperatorAndExpression_4;
import java.util.*;
public class Bitwise {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//    Find Even or Odd with the help of Bitwise operations
        System.out.println("Enter the no to find even or odd=");
        int a=sc.nextInt();
        if((a&1)==0)
        {
            System.out.println("The number is even="+a);

        }
        else
            System.out.println("The number is odd="+a);

    }
}
