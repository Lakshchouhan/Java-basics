//Finding the Fibonacci Number at a Specific Position
import java.util.Scanner;
public class dsa23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  a=0;
        int  b=1;
        int sum =0;
        for(int i=0;i<n-1;i++)
        {
           sum = a+b;
           a = b;
           b = sum;

        }
        System.out.println(sum);

    }
}

