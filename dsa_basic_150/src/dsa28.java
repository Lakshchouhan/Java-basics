//Finding the Sum of the Digits of the Factorial of a Number
import java.util.Scanner;
public class dsa28 {
    public static void main(String[] args) {
        int result = 0;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
        while(fact>0)
        {
            int r = fact%10;
            fact = fact/10;
            result = result + r;
        }
        System.out.println(result);
    }
}
