//checking prime numbers
import java.util.Scanner;
public class dsa1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of the number");
       int n = sc.nextInt();
       int count=0;
        for(int i=1;i<=n;i++)
        {
            int r = n%i;
            if(r==0){
                count++;
            }
        }
       if(count ==2)
       {
           System.out.println("prime number");
       } else{
           System.out.println("not prime");
       }
    }
}
