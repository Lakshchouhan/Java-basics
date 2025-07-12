import java.lang.reflect.Array;
import java.util.Arrays;
//finding the second largest element in an array
public class dsa49 {
    public static void main(String[] args) {
        int temp=0;
        int[] arr = {1,2,3,5,1,4,6,4,8,8,7};
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
//        System.out.println(Arrays.toString(arr));
        int max=0;
        int n = arr.length;
       for(int i=n-2;i>0;i--)
       {
           max = arr[n-1];
           if(arr[i]<max)
           {
               max = arr[i];
               break;
           }
       }
        System.out.println(max);



    }
}
