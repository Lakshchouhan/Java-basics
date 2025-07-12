//Finding Missing Numbers in a Sequence
public class dsa30 {
    public static void main(String[] args) {

        int[] arr = {2,3,5,6,7,8,10};
        for(int i=1;i<=arr.length-1;i++)
        {
            if(arr[i]-arr[i-1]==2)
            {
                System.out.println(arr[i]-1);
            }
        }



    }
}
