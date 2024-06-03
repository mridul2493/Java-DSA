import java.util.Scanner;
public class Tutorial1{
    public static void main(String[] args) {
        // There are various inbuilt functions in java for doing various tasks
        // Output/Display function or method
        System.out.println("Hello World");
        System.out.println("My name is mridul");
        // Inputs in Java
        Scanner sc = new Scanner(System.in);        //system.in correspinds to keyboard input, input
        // can also be taken from reading a file
        System.out.println(sc.nextInt());   // Integer Input
        System.out.println(sc.next());      // String Input
        System.out.println(sc.nextLine());  // Line Input
        // DataTypes
        // Primitive data types cannot be breaken down any further : Integer,float,Character,short,long,double,boolean,byte
        int age = 18;
        String name = "Yadav";          //String is not a primitive data type (collection of characters)
        char letter = 'm';
        float marks = 95.78f;
        double d1 = 45678.8978654D;     //Large decimal numbers
        long l1 = 1234567890123456789L;        //Large Integer Values
        boolean b1= true;
        boolean b2 = false;
        // maximum size of data types
        // int and float = 4 bytes of data 
        // double and long = 8 bytes
        // char = 16 bytes
        // byte = 1 byte
        // short = 2 bytes
        // boolean = 1 bit
        // short data type is a shorter version of int data type 
        // so basically short<int<long
        short sh = 12345;
        // short can hold an integer of digits = 5, int can hold an integer of digits = 10, long can hold an integer of digits = 19
        
    }
}