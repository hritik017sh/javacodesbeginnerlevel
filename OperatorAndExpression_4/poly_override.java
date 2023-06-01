package OperatorAndExpression_4;

public class poly_override {
    public void sweta()
    {
        System.out.println(" Hii sweta 1");

    }
    public void shreya()
    {
        System.out.println("Hii anika and kashu");

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
            name.shreya();
            name.sweta();

        }
    }

