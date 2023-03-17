//Write a program to demonstrate static variables, methods, and blocks//
public class uc6 {
    static   int a=10;
    static  int b=20;
    static  int c=22;
    static int d=550;
// static method declartion//
    static  void  display() {
        System.out.println(" this is static method");
        System.out.println(" this is static varilable");
        System.out.println(uc6.c);
        System.out.println(uc6.d);

    }
    public static void  main(String [] args) {
        //static methid calling
        uc6.display();
        System.out.println(" static value of a is :- " +uc6.a);
        System.out.println(" this is ststic  of value b is :- " +uc6.b);
    }
}
