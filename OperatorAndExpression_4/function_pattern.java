package OperatorAndExpression_4;
import java.util.*;
public class function_pattern {

  public  static  void pattern1()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int  col=1;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }


    static void pattern2()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n-row;col++)
            {
                System.out.print(" ");
            }
            for(int p=1;p<=row;p++)
            {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }



    static void pattern3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {


            for (int col = 1; col <= n - row; col++) {

                System.out.print(" ");
            }
            for (int p = 1; p < row; p++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }


    static void  pattern4()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=0;row<=n;row++)
        {
            for(int col=0;col<=row;col++)
            {
                System.out.print(" ");

            }
            for(int p=1;p<n-row+1;p++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");

        }

    }


    public static void main(String[] args)
    {


        pattern4();
    }
}
