//find average of n numbers
import java.util.Scanner;
public class Practice5 {
    public static void main(String[] args) {
        System.out.println("enter the number of integers you want to find average ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i=0;
        int n;
        float sum=0;
        System.out.println("enter the numbers");
      do{
          n = sc.nextInt();
          i++;
          sum = sum+n;
      } while(i<number);
        System.out.println("average is "+sum/n);
    }
}
