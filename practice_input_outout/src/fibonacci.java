import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        for (int i = 0; i < 20; i++) {
            System.out.println(a+" ");
            int sum = a+b;
            a=b;
            b=sum;
        }
    }
}
