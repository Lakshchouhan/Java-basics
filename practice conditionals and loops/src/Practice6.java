//find the number of factors
import java.util.Scanner;
public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int i=1;
        System.out.println("factors are: ");
        while(i<=n)
        {
            int f = n%i;
            if(f==0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
