//sort an array
import java.util.Arrays;

public class dsa15 {
    public static void main(String[] args) {
        int[] arr = {1,4,7,15,9,11};
        sort(arr);

    }

    static void sort(int[] arr)
    {
        int temp=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
