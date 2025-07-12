import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give input: ");
        long n = sc.nextLong();
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}