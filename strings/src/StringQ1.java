public class StringQ1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Laksh");

        for(int i=0;i<sb.length()/2;i++)
        {
           int front =i;
           int back = sb.length()-1-i;
           char frotchar = sb.charAt(front);
           char backchar = sb.charAt(back);
           sb.setCharAt(front ,backchar);
           sb.setCharAt(back, frotchar);
        }
        System.out.println(sb);
    }
}
