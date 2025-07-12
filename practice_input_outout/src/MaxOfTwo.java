import java.util.Scanner;
public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input 2 numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a>b){
            System.out.println(a+" is bigger");
        }
        else{
            System.out.println(b+" is bigger");
        }
    }
}

