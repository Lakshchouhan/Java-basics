//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
import java.util.Scanner;
public class pf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("enter the value of c");
        int c = sc.nextInt();
        max(a,b,c);
        min(a,b,c);
    }

    static void max(int a ,int b,int c){
        if(a>b && a>c)
        {
            System.out.println("a is max ");
        }
        else if(b>c)
        {
            System.out.println("b is max");
        }
        else
        {
            System.out.println("c is max");
        }

    }
    static void min(int a,int b,int c)
    {
        if(a<b && a<c)
        {
            System.out.println("a is min ");
        }
        else if(b<c)
        {
            System.out.println("b is min");
        }
        else
        {
            System.out.println("c is min");
        }
    }

}
