//inding the Sum of Elements in an Array
public class dsa16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr));
    }

    static int sum(int[] arr)
    {
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }

}
