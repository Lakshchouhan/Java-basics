import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums)
    {
        nums[0]=99;   //if you make change in the object using this reference variable original object is going to be changed
    }
}
//To properly swap the values, you would need to use a container (such as an array) or a custom class to hold the values,
// allowing the swap method to modify the original data. Here’s an example using an array: