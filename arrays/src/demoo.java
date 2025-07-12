import java.util.Arrays;

public class demoo {
    public static void main(String[] args) {
        int[][] arr = {{1,3,6,7},{4,9,3,1},{0,3,8,7},{3,4,6,1}};
        int[][] result = new int[4][4];
        int n = arr.length;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
               result[i][j] = arr[n-1][i];
               n--;
            }
            n = arr.length;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(result[i][j]);

            }
            System.out.println();
        }
    }
}
