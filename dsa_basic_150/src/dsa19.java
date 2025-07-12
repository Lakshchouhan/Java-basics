//Finding Prime Numbers in a Range
public class dsa19 {
    public static void main(String[] args) {
        int start = -4;
        int end = 500;
        for(int i = start;i<=end;i++)
        {
            if(isprime(i)==true)
            {
                System.out.println(i);
            }
        }
    }
    static boolean isprime(int n)
    {
        if(n<=1) return false;
        int i = 2;
        while(i*i<=n)
        {
           if(n%i==0)
           {
               return false;
           }
         i++;
       }
      return true;
    }

}
