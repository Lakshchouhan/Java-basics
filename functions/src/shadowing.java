public class shadowing {
    static int x =50; //this will be shadowed at line 6

    public static void main(String[] args) {
        System.out.println("x is "+x);
        int x = 40;// the class variable at line 2 is shadowed by this
        System.out.println("x is "+x);
        fun();
    }
    static void fun()
    {
        System.out.println("x is "+x);
    }

}
