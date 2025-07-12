import java.util.Arrays;

//Generating a Square Matrix of a Given Size
public class dsa39 {
    public static void main(String[] args) {
        int n =3;
        int i=1;
        int[][] arr = new int[n][n];
        for(int row=0;row< arr.length;row++)
        {
            for(int col=0;col< arr.length;col++)
            {
                arr[row][col] = i;
                System.out.print(arr[row][col]+" ");
                i++;
            }
            System.out.println();
        }
    }
}
