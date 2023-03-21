package DataTypesAndVariable;

public class Unicode_18
{
    public static void main(String[] args)
    {
         // Greek language with the help of unicode
        for(char a=0x0370;a<=0X03FF;a++)
         System.out.println(a);

        //indian language with the help of unicode

        for(char devnagri=0X0900;devnagri<=0X097f;devnagri++)
         System.out.println(" "+devnagri);
    }

}
