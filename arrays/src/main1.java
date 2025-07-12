import java.util.Arrays;

public class main1 {
    public static void main(String[] args) {
//        here nums is pointing to the array object
        int[] nums = {1,2,4,5,6};
        System.out.println(Arrays.toString(nums));
        changeArray(nums);
        System.out.println(Arrays.toString(nums));
    }
//    now the copy of reference variable(that is nums ) is passed into the function(name of reference variable in the function is arr)
//    now both nums and arr are pointing to the same object
//    now in the function we are changing the element at oth index to 99
//    isn't the original value being changed
//    it is changed because both are pointing to the same object
static void changeArray(int[] arr)
    {
         arr[0] =99;
    }
}
//strings are immutable in java while arrays are mutable
//mutable means that you can change the object
