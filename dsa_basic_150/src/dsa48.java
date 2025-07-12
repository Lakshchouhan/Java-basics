//printing sum of prime factors of an array
public class dsa48 {

    public static void main(String[] args) {
        int n=12;
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0 && isprime(i)==true)
            {
                sum = sum +i;
            }
        }
        System.out.println(sum);

    }

    static boolean isprime(int n)
    {
        if(n==1)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }

        return true;
    }

}
