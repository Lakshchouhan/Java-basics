//print sum of digits of a number
import java.util.Scanner;
public class Practice12 {
        public static void main(String[] args) {
            System.out.println("enter a number");
            Scanner sc= new Scanner(System.in);
            int a = sc.nextInt();
            int r1;
            int sum=0;
            while(a>0)
            {
                r1 =a%10;
                a=a/10;
                sum = sum + r1;
            }

            System.out.println(sum);
        }
    }




