import java.util.Scanner;
public class function1 {
    public static int add(int a,int b){

        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of num 1: ");
        int a = sc.nextInt();
        System.out.println("enter the value of num 2: ");
        int b = sc.nextInt();
        int sum = add(a,b);
        System.out.println("sum is "+sum);
    }
}
