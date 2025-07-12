//print pattern
//    *
//   ***
//  *****
// *******
//*********
public class dsa4 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i+1;k++)
            {
                System.out.print("*");
            }
            for(int l=1;l<5-i;l++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
