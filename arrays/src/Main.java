import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        how tp declare array
        int[] A = new int[5];
        int[] Arr = {1,2,4,7,8};
        System.out.println(A[0]);
        System.out.println(Arr[4]);
// how to insert elements in an array
        int[] A1 = new int[5];
        A1[0] = 1;
        A1[1] = 6;
        A1[2] = 5;
        A1[3] = 9;
        A1[4] = 2;
        System.out.println(A1[0]+" "+A1[1]+" "+A1[2]+" "+A1[3]+" "+A1[4]);
// how to take input in array using loops
        int[] A2 = new int[5];
      Scanner sc = new Scanner(System.in);
      for(int i=0;i<A2.length;i++)
      {
           A2[i] = sc.nextInt();
      }
//how to print using for loop
      for(int i=0;i<A2.length;i++)
      {
          System.out.println(A2[i]);
      }
//how to print using for each loop
        for(int num : A2) //for every element in the array print the element
        {
            System.out.println(num); //here num represents element of the array
        }

//simple method to print the array
        System.out.println(Arrays.toString(A2));
    }


}


