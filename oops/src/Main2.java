//magic numbers
public class Main2 {
    public static void main(String[] args) {
        int n=4;
       int ans =0;
       int base = 5;
       while(n>0)
       {
           int last = n&1;
           ans = base*last + ans;
           base = base*5;
           n = n>>1;
       }
        System.out.println(ans);
    }
}
