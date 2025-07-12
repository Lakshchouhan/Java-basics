import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ans =0;
        while(true) {
            System.out.println("enter the operation: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.println("enter the value of first numbers: ");
                float a = sc.nextInt();
                System.out.println("enter the value of second number: ");
                float b = sc.nextInt();

                if (op == '+') {
                    ans = a + b;
                } else if(op=='-'){
                    ans = a-b;
                } else if (op=='*'){
                    ans = a*b;
                } else if( op=='/')
                {
                    ans = a/b;
                } else if(op == 'x')
                {
                    break;
                } else if(op == 'X')
                {
                    break;
                } else{
                    System.out.println("invalid operation");
                }
                System.out.println("Ans is"+ans);
            }
        }
    }
}
