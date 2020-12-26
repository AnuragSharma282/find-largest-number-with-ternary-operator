
import java.util.Scanner;

public class TernaryOperators {
    public static void main (String[]args){
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        a =sc.nextInt();
                b =sc.nextInt();
                c =sc.nextInt();
                d =sc.nextInt();
                int max=0;

      max=  (a>b&&a>c&&a>d)?a:b>c&&b>d?b:c>d?c:d;
        System.out.println(max);
    }
}
