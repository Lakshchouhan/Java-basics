//check for palindrome number
import java.util.Scanner;
public class Practice8 {
    public static void main(String[] args) {
        System.out.println("enter two numbers");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int a = num;
        int r1;
        int sum=0;
        while(a>0)
        {
           r1 =a%10;
            a=a/10;
             sum= sum*10 + r1;
        }

        if(num==sum)
        {
            System.out.println("number is palindrome");
        } else{
            System.out.println("not");
        }
    }
}
