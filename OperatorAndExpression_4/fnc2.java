package OperatorAndExpression_4;

public class fnc2 {

            protected String fname="Hritik";
            protected String lname="Sharma";
            protected String email="Hritik017sharma@gmail.com";
            protected int age =23;

        }
        class Hritik extends fnc2
        {
            private int graduationyear=2018;
            public static void main(String[] args)
            {
               Hritik  myobj=new Hritik();
                System.out.println("Name: "+myobj.fname+" "+myobj.lname);
                System.out.println("Name: "+myobj.email);
                System.out.println("Name: "+myobj.age);
                System.out.println("Name: "+myobj.graduationyear);

            }
        }

