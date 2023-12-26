package sec01_array.EX03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InitalValue {
    public static void main(String[] args) {
        int value1;
        //System.out.println(value1); //오류
        int[] value2;
        //System.out.println(value2); //오류

        int value3 = 0;
        //System.out.println(value3);
        int[] value4 = null;    //null로 초기화
        System.out.println(value4);
        System.out.println();

        boolean[] value5 = new boolean[3];  //false로 초기화
        System.out.println(value5); //참조하는 주소값 출력
        for (boolean b : value5)
            System.out.print(b);

        System.out.println();

        int[] value6 = new int[3];  //0으로 초기화. double의 경우 0.0이 된다.
        for (int i : value6)
            System.out.print(i);

        System.out.println();

        String[] value7 = new String[3];
        for(String s : value7)
            System.out.print(s + ", ");

        System.out.println();

        System.out.println(Arrays.toString(value4));
        System.out.println(Arrays.toString(value5));
        System.out.println(Arrays.toString(value6));
    }
}