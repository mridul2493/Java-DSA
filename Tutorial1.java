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
        int i1=sc.nextInt();
        System.out.println("Integer entered = "+i1);
        System.out.print("Enter your registraion number = ");
        String reg = sc.next();
        System.out.println("Your Registration Number is = "+reg);
        // System.out.println() is used for writing the next sentence in new line 
        // System.out.print() is used for writing in the same line
        float f1=10;
        System.out.println(f1);
        // we entered f1 =10 (as an integer) but sout gives 10.0 :- casting
        //Type conversion (when one type of data is assigned to other type of variable)
        // For example :-
        float f2 = sc.nextFloat();
        System.out.println(f2);
        // for type conversion there are two rules :-
        // 1. destination type should be greater than source type (float is greater than int)
        // 2. the data should be compatible , 
        //for example 10= 10.0=10.00, but we cant store string or character data into float type as float values and string values are not at all compatible
        // if you are asking for integer and giving float this will not work
        // but if you are asking for float and giving integer than it will work
        // java performs automatic type conversion
        // TypeCasting :- narrowing conversion (forcefully converting type)
        int num = (int)(34.89f);        // it will only give the integer value of 34.89
        System.out.println(num);        //This is known as typecasting
        // java follows unicode :- multiple languages can be printed like hindi, chinese etc
        String phrase = "आप कैसे हैं";
        System.out.println(phrase);
    }
}