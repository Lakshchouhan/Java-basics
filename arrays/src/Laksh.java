import java.util.Scanner;
public class Laksh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>2)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.print(i);
            }
        }
        else {
            for(int i=0;i<5;i++)
            {
                System.out.print(i);
            }
        }
    }
}
