import java.sql.SQLOutput;

public class string3 {
    public static void main(String[] args) {
        String name1 = "laksh";
        String name2 = "laksh";
//        if string 1> String 2 --> it will return a positive value
//        if string 1 = string 2 --> it will return a zero value
//        if string 1<string 2 --> it will return a negative value
//        how it will compare if the 2 strings are equal or not
//        if there are 2 words hello and wello the w in bigger than h so string 2 is bigger
//        if there are 2 words hello and hollo the second letter of word 2 "o" is bigger than second letter of word 1
        if(name1.compareTo(name2)==0)
        {
            System.out.println("strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
//substring
        String name = "TonyStark";
        System.out.println(name.substring(0, 4));

//ParseInt Method of Integer class
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);
//ToString Method of String class
        int num = 1234;
        String strr = Integer.toString(num);
        System.out.println(strr + " "+strr.length());
//        ALWAYS REMEMBER : Java Strings are Immutable.
    }
}
