import java.util.Scanner;
public class AmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give the input: ");
        int a = sc.nextInt();
        int sum=0;
        int Number = a;
        while (a>0) {
            int b = a % 10;
            sum = sum + b*b*b;
            a = a / 10;
        }
        System.out.println("a is "+a);
        System.out.println("sum is"+sum);
        if(sum==Number){
            System.out.println("amstrong");
        }
        else{
            System.out.println("not amstrong");
        }

    }
}

//ans = ans*10 + remainder