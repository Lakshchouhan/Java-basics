//find the average of elements in an
// array
public class dsa44 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8};
        float sum =0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum/arr.length);
    }
}
