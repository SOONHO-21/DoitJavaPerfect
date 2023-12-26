package sec01_array.EX06;

public class RectangleArrayDefinnition {
    public static void main(String[] args) {
        //int[][] array1 = new int[3][4];
        //int[][] array2;
        //int array2[][];
        //array2 = new int[3][4];
//        int[][] array1 = new int[2][3];
//        array1[0][0] = 1;
//        array1[0][1] = 2;
//        array1[0][2] = 3;
//
//        int[][] array2 = new int[][] {{1,2,3}, {4,5,6}};
//
//        int[][] array3;
//        array3 = new int[][]{{1,2,3}, {4,5,6}};
//
//        int[][] array4 = new int[2][3];
//        //array4 = {{1,2,3}, {4,5,6}};  //이런 형태는 불가능
//
//        int[][] array5 = {{1,2,3}, {4,5,6}};

        String[] str = {"ab", "cd", "ef", "gh", "ij"};
        for (String s : str){
            System.out.println(s);
        }

        System.out.println();

        int[] nums = {6, 3, 9, 1, 7, 5};
        for (int n : nums){
            System.out.println(n);
        }
    }
}