import java.util.Scanner;

//To find the sum of command-line arguments and count the invalid integers entered.//
public class UC4 {
    public static  void  main( String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the firts number");
        int a =sc.nextInt();
        System.out.println(" Enter the second number");
        int b =sc.nextInt();
        int c= a+b;
        System.out.println(" sum of values" + c);
    }

}
