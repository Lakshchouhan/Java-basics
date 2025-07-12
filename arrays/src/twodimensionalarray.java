import java.util.Arrays;
import java.util.Scanner;
public class twodimensionalarray
{
    public static void main(String[] args) {
//    declaring a 2-d array
        //int[][] arr = new int[3][];
//        int[][] arr =
//                {{1,2,3}, //oth index
//                {2,6},    //first index
//                {1,6,8,9} //second index
//                };
    Scanner sc = new Scanner(System.in);
     int[][] arr = new int[3][3];
//     input
        for(int row =0;row<arr.length;row++)
        {
            for(int col =0;col<arr[row].length;col++)
            {
                arr[row][col] = sc.nextInt();
            }

        }
//    output
        for(int row =0;row<arr.length;row++)
        {
            for(int col =0;col<arr[row].length;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

//        output
        for(int row =0;row<arr.length;row++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }

//        printing using advance for loop
        for(int[] num : arr)
        {
            System.out.println(Arrays.toString(num));
        }
    }

}
