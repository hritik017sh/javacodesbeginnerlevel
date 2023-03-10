import java.util.*;

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


       String st="hritik";
       int val=st.length();
       System.out.println(val);

       //string for adding two strings
        String s1="hritik";
        String s2="naveen";
        s1+=s2;
        System.out.println(s1);

        //how to use trim in string
        String a1="        hello   master";
        String Stripleading=a1.stripLeading();
        System.out.println(Stripleading);

        String a2="  Hello  Hritik Welcome Back";
        String stir=a2.stripIndent();
        System.out.println(stir);

        String a3="hello  nokia";
        int  sitr=a3.length();
        System.out.println(sitr);



    }
}
