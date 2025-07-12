import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
     fun(2,4,5,7,8,8,9,9);
     multiple(5,3,"laksh","hello");
    }
    static void fun(int ...v) //when you dont know how many numbers of arguments you have to pass you can use this
    {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a,int b,String ...v) //by this you can pass multiple arguments of different data type
            //but v should only come at the last
    {

    }

}
