import java.util.Arrays;

public class ArraysEX {
    public static void main(String[] args){
        int[] arr = new int[1000];

        for(int i = 0; i < arr.length; i++) {

            arr[i] = i;

        }
        // binarySearch : 전달받은 배열에서 특정 객체의 위치를 이진 검색 알고리즘을 사용하여 검색한 후
        // 해당 위치를 반환
        System.out.println(Arrays.binarySearch(arr, 561));

        // copyOf : 첫 번째 매개변수로 원본 배열을 전달받고
        // 두 번째 매개변수로 원본 배열에서 새로운 배열로 복사할 요소의 개수를 전달받음
        //이때 새로운 배열의 길이가 원본 배열보다 길면, 나머지 요소는 배열 요소의 타입에 맞게 기본값으로 채워짐
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = Arrays.copyOf(arr1, 3);
        int[] arr3 = Arrays.copyOf(arr1, 10);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOfRange(arr1, 2, 4);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        // fill() : 전달받은 배열의 모든 요소를 특정 값으로 초기화
        Arrays.fill(arr1, 10);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //sort() : 전달받은 배열의 모든 요소를 오름차순으로 정렬
        int[] arr6 = {5, 12, 3, 10, 7};
        Arrays.sort(arr6);
        System.out.println(Arrays.toString(arr6));
    }
}