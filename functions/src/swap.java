public class swap {
    public static void main(String[] args) {
        int a =10 ;
        int b =20;
        swap(a,b);
        System.out.println(a+" "+b);
    }
    static void swap(int num1,int num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
//the swap function will not be able to swap the values of a and b as
//When you pass a and b to the swap method, it creates copies of these values.
// So any changes to num1 and num2 inside the swap method do not affect the original variables a and b in main.