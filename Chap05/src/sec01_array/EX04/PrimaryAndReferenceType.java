package sec01_array.EX04;

public class PrimaryAndReferenceType {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = array1;
        array2[0] = 7;  //참조 주소값이 가리키는 값이 변경 됨
        System.out.println(array2[0]);
        System.out.println(array1[0]);  //주소값이 가리키는 값이 7
    }
}