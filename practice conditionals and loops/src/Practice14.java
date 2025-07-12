//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.Scanner;
public class Practice14 {
    public static void main(String[] args) {
        System.out.println("enter the numbers");
        Scanner sc = new Scanner(System.in);
        int sum =0;
        do{
            int n = sc.nextInt();
            if(n!=0)
            {
                sum = sum + n;
            }
            else{
                break;
            }
        }while(true);
        System.out.println("sum is"+sum);
    }
}
