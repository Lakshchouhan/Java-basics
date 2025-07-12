public class ChangeName {
    public static void main(String[] args) {

      String name = "laksh chouhan";
      changeName(name);
        System.out.println(name);
    }
    static void changeName(String naam)
    {
        naam = "rahul rana";
    }
}

//here the name will not change because first the name is pointing to kunal and naam is also pointing to kunal
// after that the name is still pointing to kunal but the naam start pointing to rahul(whats happening here is)
// a new object being created of name rahul and here you are not changing are just creating a new object