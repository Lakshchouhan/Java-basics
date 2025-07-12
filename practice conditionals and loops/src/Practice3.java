import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int n;
        System.out.println("enter number:");

        do {
          n = sc.nextInt();
          if(n==0){
              System.out.println("max is"+max);
              break;
          } else if(n>max){
              max = n;
          }
        } while (true);
    }
}
