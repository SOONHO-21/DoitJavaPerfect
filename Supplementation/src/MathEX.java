import java.util.Random;

public class MathEX {
    public static void main(String[] args){
        // random() 메소드는 0.0 이상 1.0 미만의 범위에서 임의의 double형 값을 하나 생성하여 반환합니다.
        System.out.println((int)(Math.random()*100)); // 0 ~ 99
        System.out.println((int)(Math.random()*100) + 1); // 1 ~ 100

        Random ran = new Random();
        System.out.println(ran.nextInt(100));  // 0 ~ 99

        //abs() : 절댓값 반환
        System.out.println(Math.abs(-10));  //10
        System.out.println(Math.abs(-3.14));  //3.14

        // floor() : 인수로 전달받은 값과 같거나 작은 수 중에서 가장 큰 정수를 반환
        // ceil() : 반대로 인수로 전달받은 값과 같거나 큰 수 중에서 가장 작은 정수를 반환
        // round() : 전달받은 실수를 소수점 첫째 자리에서 반올림한 정수를 반환
        System.out.println(Math.floor(10.23122));   //10.0
        System.out.println(Math.ceil(10.23122));    //11.0
        System.out.println(Math.round(10.53122));   //11

        //max, min : 각각 두 수중 더 큰거/작은거
        System.out.println(Math.max(10, 80));
        System.out.println(Math.min(80, 10));
        System.out.println(Math.max(-10, -11)); //-10
        System.out.println(Math.min(-11, -10)); //-11

        //pow() : 전달된 두 개의 double형 값을 가지고 제곱 연산을 수행
        //sqrt() : 전달된 double형 값의 제곱근 값을 반환
        System.out.println(Math.pow(5, 3)); //5의 3 제곱. 125.0
        System.out.println(Math.sqrt(125)); //11.180339887498949
        System.out.println(Math.sqrt(64));
    }
}