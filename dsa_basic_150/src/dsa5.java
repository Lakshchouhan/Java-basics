//fibonacci series
import java.util.Scanner;
public class dsa5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements you want to print");
        int n = sc.nextInt();
        int a = 0,b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++)
        {
            int sum = a+b;
            a = b;
            b=sum;
            System.out.println(sum);
        }

    }



}
