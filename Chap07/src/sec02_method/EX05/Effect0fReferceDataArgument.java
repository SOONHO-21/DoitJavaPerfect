package sec02_method.EX05;

import java.util.Arrays;

public class Effect0fReferceDataArgument {
    public static void main(String[] args){
        int[] array = new int[]{1, 2, 3};
        modifyData(array);  //번지수가 가리키는 값이 달라지게 함
        printArray(array);
    }

    public static void modifyData(int[] a){ //참조하는 주소값(번지)이 가리키는 값이 달라지는 것
        a[0] = 4;
        a[1] = 5;
        a[2] = 6;
    }

    public static void printArray(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}