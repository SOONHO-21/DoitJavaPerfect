package sec02_string.EX02;

import java.util.Arrays;

public class ModificationOfStringData {
    public static void main(String[] args) {
        String str1 = new String("안녕");
        String str2 = str1;

        str1 = "안녕하세요"; //아예 새로운 객체 생성

        System.out.println(str1);   //안녕하세요
        System.out.println(str2);   //안녕

        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = array1;
        array2[0] = 4;
        array2[1] = 5;
        array2[2] = 6;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}