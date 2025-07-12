//Finding the Sum of Squares of Digits
public class dsa38 {
    public static void main(String[] args) {
        int n=123;
        int square =0;
        while(n>0)
        {
          int r = n%10;
          n = n/10;
          square = square + r*r;

        }
        System.out.println(square);

    }
}
