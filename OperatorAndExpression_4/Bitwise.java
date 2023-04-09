package OperatorAndExpression_4;
import java.util.*;
public class Bitwise {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
//        ---Find Even or Odd with the help of Bitwise operations--
//        System.out.println("Enter the no to find even or odd=");
//        int a=sc.nextInt();
//        if((a&1)==0)
//        {
//            System.out.println("The number is even="+a);
//
//        }
//        else
//            System.out.println("The number is odd="+a);



//              --Find the ith bit of any number--
//        int b=0b1110;
//       int  i=5;
//        if((1<<i&b)==0)
//        {
//            System.out.println("the no is 0");
//
//        }
//        else
//            System.out.println("The no is 1");



//       --Set ith bit as 1 with the help of bitwise--
//        int n=0b10100;
//        int i=3;
//        int mask=1<<i;
//        n=n|mask;
//        System.out.println(Integer.toBinaryString(n));



//         --How to clear the  ith bit--
//        int num=0b11000;
//        int i=3;
//        int mask=1<<i;
//        num=num^mask;
//        System.out.println(Integer.toBinaryString(num));


//          --another method--
//        int num=0b11000;
//        int i=3;
//        int mask=~(1<<i);
//        num=num&mask;
//        System.out.println(Integer.toBinaryString(num));



 // how to make every last one to zero with the help of bitwise

//     int num=0b110001;
//     int mask=num&num-1;
//     System.out.println(Integer.toBinaryString(mask));

        int n=0b11001000;
        int i=3;
        i=1<<i;
       n=n^i;
       System.out.println(Integer.toString(n));



















    }
}
