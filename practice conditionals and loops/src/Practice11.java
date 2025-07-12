//check number is perfect or not
import java.util.Scanner;
public class Practice11 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int r;
        int sum=0;
        while(i<n)
        {
        if(n%i==0)
        {
            sum = sum+i;
        }
        i++;
        }
        if(sum==n){
            System.out.println("perfect number");
        } else{
            System.out.println("not perfect");
        }
    }
}
