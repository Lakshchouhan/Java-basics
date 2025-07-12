import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++)
        {
            System.out.println(i + " "+ binary(i));
        }
    }

    static ArrayList<Integer> binary(int n)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        while(n>0)
        {
            ans.add(n%2);
            n = n/2;
        }
        Collections.reverse(ans);

        return ans;
    }

}
