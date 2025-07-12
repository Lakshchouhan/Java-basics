import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
      int ans=   sum();
        System.out.print("sum is: "+ans);
    }
    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        return a+b;

//       once we write the return statement no other line of code written aftter that in that block will get executed
    }
}
