import java.util.Scanner;
class dsa10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of number 1: ");
        int n1 =sc.nextInt();
        System.out.println("enter the value of number 2: ");
        int n2 = sc.nextInt();
        int i=1;
        int maxof2=0;
        int max =0;
        if(n1>n2)
        {
            maxof2=n1;
        }
        else {
            maxof2=n2;
        }

        while(i<maxof2)
        {

            if(n1%i==0 && n2%i==0 && n1%i==n2%i)
            {
                max = i;
            }
            i++;
        }

        System.out.println("gcd is "+max);
    }

}
