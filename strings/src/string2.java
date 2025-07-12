public class string2 {
    public static void main(String[] args) {
        String fname = "laksh";
        String lname = "chouhan";
//        how to perform concatenation in the string
        String fullname = fname +" "+ lname;
        System.out.println(fullname);
//        hwo to print length of a string
        System.out.println(fullname.length());
//        how to print character in string
        for(int i=0;i<fullname.length();i++)
        {
            System.out.println(fullname.charAt(i));
        }
    }
}
