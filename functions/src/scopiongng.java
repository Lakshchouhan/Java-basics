public class scopiongng {
    public static void main(String[] args) {
//        scoping in for loop
        int n =10;
        int j=5;
//      anything initialised outside we can use it inside but anything initialised inside we cannot use it outside
//        but anything we initialised outside we can make changes in that inside
//        anything is initialised outside it cannot be initialised again inside
        for(int i=0;i<n;i++)
        {
            j = 100;
            int a =10;
            System.out.println(a+i);
        }
        System.out.println("j is "+j);

//        System.out.println(a); this will throw an error because "a" is initialised inside for loop and due
//        and due to block scoping we can only use "a" inside the for loop
    }
}
