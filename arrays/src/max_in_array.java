import java.util.Arrays;

public class max_in_array {
    public static void main(String[] args) {
        int[] arr = {1,5,3,6,8};
        max(arr);


    }
    static void max(int[] arr)
    {
        int max = 0;
        int i=max+1;
        while(i<arr.length)
        {
            if(arr[max]<arr[i])
            {
               arr[max] = arr[i];
            }
            i++;
        }
        System.out.println(arr[max]);
    }

}


