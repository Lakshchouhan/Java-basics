//to use the minimal code we can define a cosntructor

class Main{
    public static void main(String[] args) {
        Constuct pen1 = new Constuct("blue", 10);
        Constuct pen2 = new Constuct("red", 15);
        System.out.println(pen1.color);
        System.out.println(pen1.price);
        System.out.println(pen2.color);
        System.out.println(pen2.price);
    }
}
class Constuct {  String color; int price;
    Constuct(String color,int price) // parameterized constructor
  {
      this.color = color; // this is a reference variable in Java that refers to the current object — the object whose method or constructor is being called.
      this.price = price;
  }
}


