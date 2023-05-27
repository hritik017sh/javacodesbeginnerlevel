package OperatorAndExpression_4;

import java.sql.SQLOutput;

public class polymorphism1 {
    //overloading
    public void hritik()
    {
        System.out.println("Hii hritik");
    }
    public void hritik(String a)
    {
        System.out.println("Hello "+a);
    }
        }
        class poly
        {
            public static void main(String args[])
            {
                polymorphism1 myname=new polymorphism1();

                myname.hritik("Hritik");
            }
        }

