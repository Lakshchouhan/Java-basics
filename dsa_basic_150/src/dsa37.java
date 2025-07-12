//finding perfect squares
public class dsa37 {
    public static void main(String[] args) {
        int n = 25;
        int i=2;
        while(i*i<=n)
        {
            if(i*i==n)
            {
                System.out.println(i);
            }
            i++;
        }

    }
}
