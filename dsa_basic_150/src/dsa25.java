//Finding the Number of Digits in a Number
import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.util.Scanner;
public class dsa25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println(count(n));

        }
    static int count(int n)
    {
        int count =0;
        while(n>0)
        {
            n = n/10;
            count++;
        }
        return count;
    }


}
