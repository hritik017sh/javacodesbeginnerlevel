package DataTypesAndVariable;

public class HowToUseString {
    public static void main(String args[])
    {
        //How to find string length while we have a string given
        String str="Hritik sharma";
          int value=str.length();
           System.out.println(value);

        //How to make String capital letter into small letters
        String strin="Akash Kumar";
        String sstring=strin.toLowerCase();
        System.out.println(sstring);

        //How to use string small letter into capital letters
        String smallletters="hritik sharmA";
        String ustring=smallletters.toUpperCase();
        System.out.println(ustring);


        //how to find string letters
        String letters="How many letters";
        int totalintletter=letters.length();
        System.out.println(totalintletter);

        //how to find string letters
        //String letters="How many letters";
       // int totalintletter=letters.length();
       // System.out.println(totalintletter);


    }
}
