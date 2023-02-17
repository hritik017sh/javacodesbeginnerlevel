import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        int n1, n2, highestno;
        boolean a=true;

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER=");
        n1 = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER=");
        n2 = sc.nextInt();

        highestno = (n1 > n2) ? n1 : n2;

        while (a) {
            if (highestno % n1 == 0 && highestno % n2 == 0) {
                System.out.println("The lcm is"+highestno);

                break;
            }
            ++highestno;

        }

    }
}



