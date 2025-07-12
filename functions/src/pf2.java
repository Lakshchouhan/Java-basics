//to check if a number is prime or not
import java.util.Scanner;
public class pf2 {
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       boolean ans = prime(n);
        System.out.println(ans);
    }
    static boolean prime(int n)
    {

        int i=2;
        if(n==1)
        {
            return false;
        }

        while(i*i<n)
        {
            if(n%i==0)
            {
                return false;
            }
            i++;
        }
        if (i * i > n) return true;
        else return false;
    }


}

