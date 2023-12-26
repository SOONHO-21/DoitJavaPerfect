package sec01_array.EX02;

public class ValueAssignment {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        array1 = new int[]{1, 2, 3};
        System.out.println(array1[0] + ", " + array1[1] + ", " + array1[2]);

        int[] array2;
        array2 = new int[3];
        array2[0] = 4;
        array2[1] = 5;
        array2[2] = 6;
        System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2]);

        int[] array3 = new int[]{7,8,9};
        System.out.println(array3[0] + ", " + array3[1] + ", " + array3[2]);

        int[] array4 = {10, 11, 12};
        System.out.println(array4[0] + ", " + array4[1] + ", " + array4[2]);
    }
}