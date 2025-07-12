//finding armstrong number in range
import java.lang.Math;
public class dsa17 {
    public static void main(String[] args) {
        int start = 1;
        int end = 500;
        for(int i= start;i<=end;i++)
        {
           if(isarmstrong(i))
           {
               System.out.println(i);
           }

        }
    }

static boolean isarmstrong(int n)
{
    int original = n;
    double sum=0;
    while(n>0)
    {
        int r = n%10;
        n = n/10;
      sum = sum + Math.pow(r,3);
    }

    return sum == original;
}
}

