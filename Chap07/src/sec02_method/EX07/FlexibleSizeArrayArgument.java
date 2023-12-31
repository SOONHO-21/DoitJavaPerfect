package sec02_method.EX07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FlexibleSizeArrayArgument {
    public static void main(String[] args){
        method1();
        method1(1, 2);
        method1(1, 2, 3);
        method2();
        method2("안녕", "방가");
        method2("땡큐", "베리", "감사");
    }
    public static void method1(int...values) {
        System.out.println("배열의 길이: " + values.length);

        for(int i=0; i<values.length; i++)
            System.out.print(values[i] + " ");
        System.out.println();

        for(int k: values)
            System.out.print(k);
        System.out.println();

        System.out.print(Arrays.toString(values));

        System.out.println();
    }
    public static void method2(String...values) {
        System.out.println("배열의 길이: " + values.length);
        for(int i=0; i<values.length; i++)
            System.out.print(values[i] + " ");
        System.out.println();
        for(String k: values)
            System.out.print(k);
        System.out.println();
        System.out.print(Arrays.toString(values));

        System.out.println();
    }
}