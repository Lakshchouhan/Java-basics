//use of final keyword
class finalll {
    public static void main(String[] args) {
        A student1 = new A();
//        student1.roll = 5; // we cannot do that because we are using a final keyword
        System.out.println(student1.roll);
        final B kunal = new B();
        kunal.name = "new name"; // but in can do this in references
        System.out.println(kunal.name);
    }

}
 class A{
    final int roll = 10;
 }

 class B{
    String name = "nil";
 }


