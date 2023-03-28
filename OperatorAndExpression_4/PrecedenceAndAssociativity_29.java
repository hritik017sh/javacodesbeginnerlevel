package OperatorAndExpression_4;
import com.sun.jdi.IntegerType;

import java.util.*;
import java.lang.*;
public class PrecedenceAndAssociativity_29
{
    public static void main(String args[])
    {
//       // How to use airthmetic operators of +(sum)
//        short  a=45,b=90;
//        int c=a+b;
//        System.out.println(c);
//
//       //how to use divide in airthmetic
//        float f=178.8f,d=78.9f;
//        float fl=f/d;
//        System.out.println(fl);
//
//       //How to use multiflication in airthmetic
//        float f5=78.8f,d5=78.9f;
//        float fa=f*d;
//        System.out.println(fa);

//
//        // how to find the area of  triangle
       Scanner sc=new Scanner(System.in);
//        System.out.println("Enter two value for area of trianle=");
////       int base=sc.nextInt();
//       int height=sc.nextInt();
//       float area=base*height/2 ;
//        System.out.println("The area of triangle is= "+area);

        //how to find 3 sides of triangle
       double aa,bb,cc;
        System.out.println("Enter 3 sides to find area of triange=");
        aa=sc.nextDouble();
        bb=sc.nextDouble();
        cc=sc.nextDouble();
        Double s;

        double area;
        s=(aa+bb+cc)/2;
        area=Math.sqrt(s*(s-aa)*(s-bb)*(s-cc));
        System.out.println("Area is ="+ area);






    }
}