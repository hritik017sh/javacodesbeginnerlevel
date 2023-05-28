package OperatorAndExpression_4;

public class poly_override {
    public void sweta()
    {
        System.out.println(" Hii sweta 1");

    }
}

    class tanu extends poly_override
    {
        public void sweta()
        {
            System.out.println("Hiii tanu");
        }

    }


    class naveen
    {
        public static void main(String args[])
        {
            poly_override name=new  tanu();
            name.sweta();
            name.sweta();
        }
    }

