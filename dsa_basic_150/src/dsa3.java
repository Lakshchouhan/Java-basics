//Calculating Armstrong Numbers
import java.util.Scanner;
public class dsa3 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int number = n;
        while(number>0)
        {
           int  digit = number%10;
            number = number/10;
            sum = sum + digit*digit*digit;
        }
        if(n ==sum){
            System.out.println("Armstrong number");
        } else{
            System.out.println("not Armstrong");
        }
    }

}
