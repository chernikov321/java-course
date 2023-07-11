package module_1.task_4_primitive_wrappers;

public class App {

    static Byte emptyByte;
    static Short emptyShort;
    static Integer emptyInt;
    static Long emptyLong;
    static Float emptyFloat;
    static Double emptyDouble;
    static Character emptyChar;
    static Boolean emptyBoolean;

    public static void main(String[] args) {
//        Each java primitive has own wrapper class
        Byte b = 1;
        Short s = 2;
        Integer i = 3;
        Long l = 4L;
//        2 types for number variables with decimal places
        Float f = 3.14f;
        Double d = 3.14d;
//        1 type for single character
        Character c = 'c';
//        1 type for boolean
        Boolean bool = true;

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
