//Finding the Sum of Prime Numbers in a Range
public class dsa35 {
    public static void main(String[] args) {
        int start = 2;
        int end = 96;
        int sum =0;
        for(int i = start;i<=end;i++)
        {
            if(isprime(i)==true)
            {
                System.out.println(i);
                sum = sum +i;
            }
        }
        System.out.println(sum);
    }


    static boolean isprime(int n) {
        int i = 2;
        if (n == 1) {
            return false;
        }
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;

        }
        return true;

    }
}


