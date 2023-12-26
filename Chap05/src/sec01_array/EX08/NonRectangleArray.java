package sec01_array.EX08;

public class NonRectangleArray {
    public static void main(String[] args) {
        int[][] array1 = new int[2][];
        array1[0] = new int[2];
        array1[0][0] = 1;
        array1[0][1] = 2;

        array1[1] = new int[3];
        array1[1][0] = 3;
        array1[1][1] = 4;
        array1[1][2] = 5;

        int[][] array2 = new int[2][];
        array2[0] = new int[]{1,2};
        array2[1] = new int[]{3,4,5};

        int[][] array3 = new int[][]{{1,2}, {3,4,5}};
        int[][] array4 = {{1,2}, {3,4,5}};
        int[][] array5;
        array5 = new int[][]{{1,2}, {3,4,5}};

        for(int[] a : array5){
            for (int k : a)
                System.out.print(k + " ");
            System.out.println();
        }
    }
}