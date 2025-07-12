//Checking for an Anagram
public class dsa34 {
    public static void main(String[] args) {
        String s1 = "mug";
        String s2 = "gum";
        int count =0;
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    count++;

                }
            }
        }
        if(count == s1.length())
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

//it will not pass all the test cases