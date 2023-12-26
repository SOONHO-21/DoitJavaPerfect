package sec04.EX02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);
        //1-2. element()
        System.out.println(queue1.element());   //최상위 원솟값
        //1-3. E remove()
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        //System.out.println(queue1.remove());
        System.out.println();
        // 2.예외 처리
        Queue<Integer> queue2 = new LinkedList<>();
        System.out.println(queue1.peek());  //null

        queue2.offer(3);
        queue2.offer(4);
        queue2.offer(5);
        System.out.println(queue2.peek());  //3. 최상위 요소 출력. 안 뺌
        System.out.println(queue2.peek());  //3
        System.out.println();

        //빼는 메소드
        System.out.println(queue2.poll());  //3
        System.out.println(queue2.poll());  //4
        System.out.println(queue2.poll());  //5
        System.out.println(queue2.poll());  //null
    }
}