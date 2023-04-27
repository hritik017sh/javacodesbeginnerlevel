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
        
//        -----Java Booleans-----

//        boolean isJavaFun=true;
//        boolean isDrugFun=false;
//        System.out.println(isJavaFun);
//        System.out.println(isDrugFun);

//        int  x =10;
//        int y=20;
//        System.out.println(x<y);

//       int myage;
//       int votingage=18;
//     myage=sc.nextInt();
//       if(myage>=votingage)
//       {
//           System.out.println("Person is eligible for voting");
//       }
//       else
//       {
//           System.out.println("Person is not eligible for voting");
//
//       }

//        int time=19;
//        if(time<10)
//        {
//            System.out.println("Good Morning");
//
//        }
//        else if(time<20)
//        {
//            System.out.println("Good day");
//        }
//       else
//        {
//            System.out.println("BAD day");
//        }


//        ---Short hand ternary operator---

//        int time=sc.nextInt();
//        String result=(time<12)?"The time is AM="+time :"Time is PM="+time;
//        System.out.println(result);

//        ----Switch case----
//        int day=sc.nextInt();
//        switch(day)
//        {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//            default:
//                System.out.println("You entered a wrong number. You have to enter  1 to 7 to find weeks");
//        }



//       ----While condition----
//        int i=1;
//        while(i<=5)
//        {
//
//            System.out.println(i);
//            i++;
//        }

//        ----Do While loop---

//        int i=1;
//     do{
//         System.out.println(i);
//         i++;
//     }
//     while(i<=5);

//
//        ----For loop----

//        for (int i=1;i<=5;i++)
//        {
//            System.out.println(i);
//        }

//        ---Nested loop(loop Inside loop)---

//        for(int i=1;i<=3;i++)
//        {
//            System.out.println("Outer="+i);
//
//            for(int j=1;j<=4;j++)
//            {
//                System.out.println("Inner = "+j);
//            }
//
//        }


//         ----How to use for each loop----
       String[] cars={"Royls Royals","Mercedes","Bmw","Ferrari"};
          for(String i: cars)
          {
              System.out.println(i);
          }







    }
}
