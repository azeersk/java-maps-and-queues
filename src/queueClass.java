import java.util.LinkedList;
import java.util.Queue;

public class queueClass {
    public static void main(String[] args){
        Queue<Integer> queueOne = new LinkedList<>();
        queueOne.add(1);
        queueOne.add(2);
        queueOne.add(3);
        queueOne.add(4);
        queueOne.offer(5);
        queueOne.add(3);
        queueOne.offer(2);
        System.out.println(queueOne);
        System.out.println("Peek value of: "+ queueOne.peek());
        System.out.println("Poll Value of: "+ queueOne.poll());
        System.out.println("final Queue is: "+ queueOne);
        System.out.println(queueOne.element());
    }
}
