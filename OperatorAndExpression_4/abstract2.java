package OperatorAndExpression_4;

public  abstract class abstract2 {
   abstract  public void drive();
   abstract  public void fly();
    public void music()
    {
    System.out.println("the music is on ");
    }

}
    abstract class wagnor extends abstract2
    {

        public void fly()
        {
            System.out.println("The car is flying");
        }
    }
    class updatewagnor extends wagnor
    {
        public void drive()
        {
            System.out.println(" the car drives");
        }
    }



    class Main
    {public static void main(String args[])
        {
            abstract2 obj=new  updatewagnor();
            obj.drive();
            obj.fly();
            obj.music();

        }
        }