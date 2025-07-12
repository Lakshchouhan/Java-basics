//Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int product = 1;
        int ans;
        int number = sc.nextInt();
        while(number>0){
            int r = number%10;
              number = number/10;
              sum = sum+r;
              product = product*r;

        }
        System.out.println(product-sum);
    }
}
