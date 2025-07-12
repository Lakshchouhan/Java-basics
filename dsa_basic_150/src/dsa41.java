//Finding the Count of Specific Digits in a Number
public class dsa41 {
    public static void main(String[] args) {
        int n = 12233333;
        int digit = 3;
        int count =0;
        while(n>0)
        {
            int r = n%10;
            n = n/10;
            if(r==digit)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
