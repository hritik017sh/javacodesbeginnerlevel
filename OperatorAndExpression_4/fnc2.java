package OperatorAndExpression_4;

//public class fnc2 {
//
//            protected String fname="Hritik";
//            protected String lname="Sharma";
//            protected String email="Hritik017sharma@gmail.com";
//            protected int age =23;
//
//        }
//        class Hritik extends fnc2
//        {
//            private int graduationyear=2018;
//            public static void main(String[] args)
//            {
//               Hritik  myobj=new Hritik();
//                System.out.println("Name: "+myobj.fname+" "+myobj.lname);
//                System.out.println("Name: "+myobj.email);
//                System.out.println("Name: "+myobj.age);
//                System.out.println("Name: "+myobj.graduationyear);
//
//            }
//        }

 abstract public class fnc2
{
  abstract   public void bakshi();
   abstract  public void aman();
   public void akash()
   {
       System.out.println("Driving mustang");
   }


}
 abstract class cars extends fnc2
{
    public void bakshi()
    {
        System.out.println("Driving fortuner");
    }
}
    class carrs extends cars
    {
        public void aman()
        {
            System.out.println("Driving lamborgini");
        }
    }

    class cars3
    {
        public static void main(String args[])
        {
           fnc2 obj=new carrs();
           obj.aman();
           obj.bakshi();
           obj.akash();
        }
    }




