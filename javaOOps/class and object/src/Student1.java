// We can have multiple classes in different Java files or single Java file. If you define multiple classes in a single Java source file, it is a good idea to save the file name with the class name which has main() method.
public class Student1{
    int id; String name;
}
class Teststudent{
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}

