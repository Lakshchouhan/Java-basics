public class stirng4stringBuilder {
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder("laksh");
        System.out.println(sb);
//        to print letter at a particular index
        System.out.println(sb.charAt(0));
//        to change character at a particular index
        sb.setCharAt(0,'p');
        System.out.println(sb);
        StringBuilder st = new StringBuilder("tony");
        st.insert(2,"n");
        System.out.println(st);
        st.delete(2,3);
        System.out.println(st);
        st.delete(2,4);
        System.out.println(st);
        StringBuilder sm = new StringBuilder("H");
        sm.append("e");
        sm.append("l");
        sm.append("l");
        sm.append("o");
        System.out.println(sm);

    }



}
