public class conditionals {
    public static void main(String[] args) {
        int salary=25000;
//        if (salary>10000)
//        {
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }

//        multiple if else

        if (salary>10000) {
            System.out.println(salary+1000);
        } else if(salary>20000){
            System.out.println(salary+20000);
        }else{
            System.out.println("null");
        }
    }
}
