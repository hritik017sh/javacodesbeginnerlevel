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

        //how to concatination to string
        String s="Sachin";
        s=s.concat(" hritik");
        System.out.println(s);

        //another concatinationn way
        String naveen="Naveen";
        String sharma=" Sharma";
        System.out.println(naveen.concat( sharma));

        //how to add two string
        String myname="hii my name is ";
        String akash="Akash";
        System.out.println(myname+""+akash);



        //how to find index of string
        String index="Akash kumar is my  Brother";
        System.out.println(index.indexOf("my"));

        //how to add string and int
        int x=13;
        String x1="14";
        String x3=x+x1;
        System.out.println(x3);

        //backslash escape character
        String addQuote="Hritik sharma is all time \"legend\" player";
        System.out.println(addQuote);

        //Max value in integer
        System.out.println(Math.max(6,10));

        //Min value in integer
        System.out.println(Math.min(56,65));

        //How to make negative value to positive value
        System.out.println(Math.abs(-56.6));

        //how to make random value
        System.out.println(Math.random());

        //how to find random value from 1 to 100
        System.out.println(Math.random()*100);



    }
}
