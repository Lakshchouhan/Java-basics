//find distance bw 2 points
import java.util.Scanner;
public class Practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of X1");
        int x1 = sc.nextInt();
        System.out.println("enter the value of y1");
        int y1 = sc.nextInt();
        System.out.println("enter the value of X2");
        int x2 = sc.nextInt();
        System.out.println("enter the value of y2");
        int y2 = sc.nextInt();
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(distance);
    }
}
