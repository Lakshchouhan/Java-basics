import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fruit");
        String fruit = sc.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "orange" -> System.out.println("citrus fruit");
            case "banana" -> System.out.println("high carb fruit");
            case "apple" -> System.out.println("doctors recommended fruit");
            case "grapes" -> System.out.println("used for making of wine");
            default -> System.out.println("no fruit");
        }
    }

}
///if break is not there all the conditions below will get executed


