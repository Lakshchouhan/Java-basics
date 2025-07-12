//Calculating the Sum of Digits of a Number Until Single Digit
public class dsa40 {
    public static void main(String[] args) {
        int n = 9875;
       while(n>0)
       {
           int r =n%10;
//           if(sumdig(n )==)
       }

    }
    static void sumdig(int n)
    {
        int sum =0;
        while(n>0)
        {
            int r =n%10;
            n=n/10;
            sum = sum + r;
        }
    }

}
