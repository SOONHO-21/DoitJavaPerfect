import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BufferedReaderWriter {
    public static void main(String[] args) throws IOException {
        //String 타입으로 입력 받음
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer의 nextToken() 함수를 쓰면 readLine()을 통해 입력 받은 값을 공백 단위로 구분하여
        // 순서대로 호출할 수 있다.
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        //따로 파싱을 해주어야 정수로 비로소 받을 수 있다
        int n1 = Integer.parseInt(stringTokenizer.nextToken());
        int n2 = Integer.parseInt(stringTokenizer.nextToken());
        int n3 = Integer.parseInt(stringTokenizer.nextToken());
        System.out.println(n1 + n2 + n3);   //stringTokenizer 사용

//        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        int a1 = Integer.parseInt(stringTokenizer.nextToken());
//        System.out.println(a1);

        int A[][] = new int[2][2];
        int result = 0;
        //배열에 활용
        for(int i=0; i<2; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j=0; j<2; j++) {
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
                result += A[i][j];  //stringTokenizer 사용
            }
        }

        System.out.println(result);
    }
}