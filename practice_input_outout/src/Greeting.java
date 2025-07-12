import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your name: ");
        String s = sc.nextLine();
        System.out.println("Welcome "+s+" your journey begins form here");
    }
}
