public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("kunal",95,22);
        System.out.println(student1.age + " " + student1.name +" "+ student1.marks );
        student1.greeting("laksh");
    }
}  class Student {
    int rollNo; int marks; int age; String name;

    void greeting(String name)
    {
        System.out.println("good morning " + this.name);
    }

    Student (String name, int marks , int age)
    {
        this.name  = name ;
        this.marks = marks ;
        this.age = age;
    }
}


