package DataTypesAndVariable;

public class IntegralDataTypes {
    public static void main(String args[])
    {
        int j=-5;
        int i=11;
        System.out.println(Integer.toBinaryString(j));
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toOctalString(i));
    }

    public static class JavaTypeCasting {
        public static void main(String args[])
        {
            // Widening Casting//
            // Widening Casting is done automatically when passing a smaller size type to a longer size type//
            int myint=12;
            double mydouble=myint;
            System.out.println(myint);
            System.out.println(mydouble);

            //Narrowing casting//
            //Narrowing casting is done manually by placing the type in parentheses in front of the value//
            System.out.println("-----------");
            double mydble=34.44;
            int myent=(int) mydble;
            System.out.println(mydble);
            System.out.println(myent);

        //CHANGING INT VALUE TO CHAR VALUE MEANS 64 IS A IN INT BECAUSE OF ASCII CODE
            System.out.println("-----------");
            int  i=68;
             char mychar=(char) i;
             System.out.println(mychar);

            System.out.println("-----------");
            int r=12;
            float myfloat=r;
            System.out.println(myfloat);

            System.out.println("-----------");
            int s=15;
            float mafloat=s;
            System.out.println(mafloat);







        }
    }
}
