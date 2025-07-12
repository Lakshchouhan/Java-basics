// basic class and object program
class main{
    public static void main(String[] args) {
        Student student1 = new Student(); // this is how u declare objects
        Student student2 = new Student();
//        student1.name = "laksh";
//        student1.age = 22;
//        student1.rollno = 83;
        System.out.println(student1.age);
        System.out.println(student1.name);
        System.out.println(student1.rollno);

        System.out.println(student2.age);
        System.out.println(student2.name);
        System.out.println(student2.rollno);
    }
}

class Student {
    int rollno;
    int age;
    String name;
    Student()
    {
        this.name = "rahul";
        this.age = 22;
        this.rollno = 84;
    }



}