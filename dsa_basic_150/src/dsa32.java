import java.lang.reflect.Array;
import java.util.Arrays;

public class dsa32 {
    public static void main(String[] args) {
        int median;
        int[] arr = {1,2,4,8,6,3,5,13,10,87,15,12};
        int temp =0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
       int n = arr.length;
       if(n%2==0)
       {
            median = (arr[(n/2)-1] + arr[n/2])/2;
       }
       else
       {
          median = arr[((n+1)/2)-1];
       }

        System.out.println(median);
    }
}