package DataStructure;
import java.util.Collections;
import java.util.PriorityQueue;

public class PRIORITYQUEUE {
    public static void main(String[] args) {
        // minHeap
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
        // maxHep
        PriorityQueue<Integer> priorityQueueHighest = new PriorityQueue<>(Collections.reverseOrder());

        // add(value) 메서드의 경우 만약 삽입에 성공하면 true를 반환, 
        // 큐에 여유 공간이 없어 삽입에 실패하면 IllegalStateException을 발생
        priorityQueueLowest.add(1);
        priorityQueueLowest.add(10);
        priorityQueueLowest.offer(100);
        

        priorityQueueHighest.add(1);
        priorityQueueHighest.add(10);
        priorityQueueHighest.add(11);
        priorityQueueHighest.offer(100);
        System.out.println(priorityQueueHighest + " " + priorityQueueLowest);

        // 첫번째 값을 반환하고 제거 비어있다면 null
        priorityQueueLowest.poll();

        // 첫번째 값 제거 비어있다면 예외 발생
        priorityQueueLowest.remove(); 

        // 첫번째 값을 반환만 하고 제거 하지는 않는다.
        // 큐가 비어있다면 null을 반환
        priorityQueueLowest.peek();

        // 첫번째 값을 반환만 하고 제거 하지는 않는다.
        // 큐가 비어있다면 예외 발생
        priorityQueueLowest.element();

        // 초기화
        priorityQueueLowest.clear();  
        System.out.println(priorityQueueHighest + " " + priorityQueueLowest);
    }
}