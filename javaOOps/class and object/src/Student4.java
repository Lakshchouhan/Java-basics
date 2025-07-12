public class Student4 {
    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    void displayRecord() {
        System.out.println(rollno + " " + name);
    }
}
    class TestStudent4 {
        public static void main(String[] args) {
            Student4 s1 = new Student4();
            Student4 s2 = new Student4();
            s1.insertRecord(101, "laksh");
            s2.insertRecord(102, "kunal");
            s1.displayRecord();
            s2.displayRecord();
        }
    }




