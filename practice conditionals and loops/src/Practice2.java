//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;
public class Practice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int n;
        System.out.println("enter number:");
      do{
          n = sc.nextInt();
         if(n!=0) {
           sum = sum+n;
         }else {
             System.out.println("sum is: "+sum);
             break;
         }
      }while(true);
    }
}
