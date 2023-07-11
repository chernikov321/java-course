package module_1.task_2_primitives;

public class App {

    static byte emptyByte;
    static short emptyShort;
    static int emptyInt;
    static long emptyLong;
    static float emptyFloat;
    static double emptyDouble;
    static char emptyChar;
    static boolean emptyBoolean;

    public static void main(String[] args) {
//        Java has 8 primitive types
//        4 types for number variables (without decimal places)
        byte b = 1; //max value: 127
        short s = 2; //max value: 32,767
        int i = 3; //max value: 2,147,483,647
        long l = 4; //max value: 9,223,372,036,854,775,807
//        2 types for number variables with decimal places
        float f = 3.14f;
        double d = 3.14d;
//        1 type for single character
        char c = 'c';
//        1 type for boolean
        boolean bool = true;

        System.out.println("Variable with type byte: " + b);
        System.out.println("Variable with type short: " + s);
        System.out.println("Variable with type int: " + i);
        System.out.println("Variable with type long: " + l);
        System.out.println("Variable with type float: " + f);
        System.out.println("Variable with type double: " + d);
        System.out.println("Variable with type char: " + c);
        System.out.println("Variable with type boolean: " + bool);

        System.out.println();

        System.out.println("Empty variable with type byte: " + emptyByte);
        System.out.println("Empty variable with type short: " + emptyShort);
        System.out.println("Empty variable with type int: " + emptyInt);
        System.out.println("Empty variable with type long: " + emptyLong);
        System.out.println("Empty variable with type float: " + emptyFloat);
        System.out.println("Empty variable with type double: " + emptyDouble);
        System.out.println("Empty variable with type char: " + emptyChar);
        System.out.println("Empty variable with type boolean: " + emptyBoolean);
    }
}
