//Checking for Perfect Numbers
public class dsa20 {
    public static void main(String[] args) {

        int start = 1;
        int end = 500;
        for(int i=start;i<=end;i++)
        {
            if(isperfect(i)==true)
            {
                System.out.println(i);
            }
        }
    }
    static boolean isperfect(int n)
    {
        int sum =0;
         for(int i=1;i<n;i++)
         {
             if(n%i==0)
             {
                 sum = sum +i;
             }

         }
         if(n==sum)
         {
             return true;
         }
         return false;
    }

}
