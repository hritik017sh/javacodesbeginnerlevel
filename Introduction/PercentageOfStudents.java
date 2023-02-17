import java.sql.SQLOutput;
import java.util.Scanner;
public class PercentageOfStudents {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number=");
        int a=sc.nextInt();
        System.out.println("Enter second number=");
        int b=sc.nextInt();
        System.out.println("Enter third number=");
        int c=sc.nextInt();
        System.out.println("Enter fourth number=");
        int d=sc.nextInt();
        System.out.println("Enter fifth number=");
        int e=sc.nextInt();
        System.out.println("Enter total value=");
        double total=sc.nextInt();
        int sum=a+b+c+d+e;
        double percentage=(sum/total)*100;
        System.out.println("The percentage is ="+percentage);

    }
}
