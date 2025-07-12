import java.util.Scanner;
public class pf3 {
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n)
    {
        int fact = 1;
        int i=1;
        while(i<=n)
        {
             fact = fact*i;
            i++;
        }

        return fact;
    }

}
