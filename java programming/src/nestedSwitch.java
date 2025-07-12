import java.util.Scanner;
public class nestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String dept = sc.next();

        switch (empID) {
            case 1:
                System.out.println("laksh chouhan");
                break;
            case 2:
                System.out.println("kushagra mandloi");
                break;
            case 3:
                System.out.println("empID 3");
                switch (dept) {
                    case "IT":
                        System.out.println("It department");
                        break;
                    case "cse":
                        System.out.println("cse department");
                        break;
                    case "ece":
                        System.out.println("electrial deaprtment");
                        break;
                    default:
                        System.out.println("no deaprtment entered");
                }
            default:
                System.out.println("Enter correct EmpID");
        }
    }
}
