//1
//2 3
//4 5 6
//7 8 9 10
public class dsa27 {
    public static void main(String[] args) {
        int current = 1;
        for(int i =1;i<= 4;i++)
        {
            for(int j =1;j<=i;j++)
            {
                System.out.print(current );
                current++;
            }
            System.out.println();
        }
    }
}
