public class Main {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 15;
        swap(10,15);
        System.out.println(a + " " + b);
    }
    static void swap(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

}