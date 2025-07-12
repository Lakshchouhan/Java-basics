//Generating Multiplication Tables
import java.util.Scanner;
public class dsa18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        table(n);
    }

    static void table(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x"+" "+i+" = "+n*i);
        }
    }



}
