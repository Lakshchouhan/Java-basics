//summing digits of a number
public class dsa9 {
    public static void main(String[] args) {
        int  n = 8334;
        int i=0;
        int summ =0;
        int sum = summ;
        while(n>0)
        {
            int r = n%10;
            n = n/10;
            sum = sum + r;
            i++;
        }
        System.out.println("sum is "+sum);
    }
}
