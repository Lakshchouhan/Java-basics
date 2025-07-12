//vowel or consonant
import java.util.Scanner;
public class Practice9 {
    public static void main(String[] args) {
        System.out.println("enter the char");
        Scanner sc = new Scanner(System.in);
        char letter=  sc.next().charAt(0); // reads an entire word from the user, then extracts and stores the first character of that word in the variable letter.
        if(letter =='a'||letter =='e' ||letter =='i' ||letter =='o' ||letter =='u'){
            System.out.println("it is a vowel");
        } else{
            System.out.println("it is a consonant");
        }

    }
}
