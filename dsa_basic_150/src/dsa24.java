//Printing Prime Numbers Less Than a Given Number
import java.util.Scanner;
public class dsa24 {
    public static void main(String[] args) {
        System.out.println("enter value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(isprime(i)==true)
            {
                System.out.println(i);
            }
        }

    }
    static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int i =2;
        while(i*i<=n)
        {
            if(n%i==0)
            {
                return false;
            }
            i++;
        }
       return true;
    }


}
