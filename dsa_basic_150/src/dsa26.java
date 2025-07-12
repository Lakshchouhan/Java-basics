//Checking if a Number is a Narcissistic Number
import java.util.Scanner;
import java.lang.Math;
public class dsa26 {
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        System.out.println(narcissistic(n));
    }
    static boolean narcissistic(int n)
    {
        int temp = n;
        int product = 1;
        double sum =0;
       while(temp>0)
       {
          int  r = temp%10;
          temp = temp/10;
         double  power = Math.pow(r,3);
         sum = sum + power;
       }
        if(sum == n)
        {
            return true;
        }
        else
            return false;
    }

}
