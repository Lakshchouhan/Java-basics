public class TypeCasting {
    public static void main(String[] args) {

//        type casting
//    int num = (int)(45.56f);
//    System.out.println(num);

//    automatic type promotion in expression
//        int a = 257;
//        byte b = (byte)(a);//257%256 = 1
//        System.out.println(b);

//           int number = 'A';
//        System.out.println(number); // returning ascii values

           byte b = 42;
           char c = 'a';
           short s = 1024;
           int i = 50000;
           float f = 5.67f;
           double d = 0.1234;
           double result = (f*b) +  (i/c)  - (d*s);
//           float + integer - double = double // if you have multiple types all of them will be converted to the biggest ones
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);




    }
}
