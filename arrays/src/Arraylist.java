import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<>(7);
//       list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(10);
//        list.add(10);
//        list.add(9);
//        list.add(15);
//        list.add(156);
//        list.add(545);
//
//
//        System.out.println(list);
//        System.out.println(list.contains(456));
//
//        list.set(0,45);
//        System.out.println(list);
//
//        list.remove(3);
//        System.out.println(list);

        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }

        System.out.println(list);



    }
}
