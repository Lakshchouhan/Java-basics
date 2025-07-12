public class Student3 {
    int id;String name;
}
class TestStudent3{
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();

        s1.id = 101;
        s2.id = 102;
        s1.name= "laksh";
        s2.name ="kunal";
        System.out.println(s1+" "+s2);
        System.out.println(s1.id+" "+s1.name+" "+s2.id+" "+s2.name+" ");
    }
}