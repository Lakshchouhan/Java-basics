//find lcm of two numbers
import java.util.Scanner;
public class dsa11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int n1 = sc.nextInt();
        System.out.println("enter number 2");
        int n2 = sc.nextInt();
        int i=1;
        int maxof2=0;
        int lcm =1;
        if(n1>n2)
        {
            maxof2=n1;
        }
        else {
            maxof2=n2;
        }


        while(i<maxof2)
        {
            if(n1%i==0 && n2%i==0)
            {
                n1=n1/i;
                n2=n2/i;
            }
            else if (n1%i==0 && n2%i!=0)
            {
                n1 =n1/i;
            } else if (n1%i!=0 && n2%i==0)
            {
                n2=n2/i;
            }
            else
            {
                i++;
            }
            lcm=lcm*i;

        }

        System.out.println("Lcm is "+lcm);
    }
}
