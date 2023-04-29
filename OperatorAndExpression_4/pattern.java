
package OperatorAndExpression_4;
import java.util.*;
public class pattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
//                                            ---Pattern 1---
//        ****
//        ****
//        ****
//        ****

//        int no=4;
//    for(int row=1;row<=no;row++)
//    {
//        for(int col=1;col<=no;col++)
//        {
//
//            System.out.print("*");
//
//        }
//        System.out.println("");
//
//    }

//                                   ---Pattern 2---
//        *
//        **
//        ***
//        ****
//        *****

        int n=sc.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}