//leap year program
import java.util.Scanner;
public class Practice10 {
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%400==0) || (year%100!=0 && year%4==0)){
            System.out.println("leap year");
        } else{
            System.out.println("not leap year");
        }


    }
}
