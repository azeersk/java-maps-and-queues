import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class PriorityClass {
    public static void main(String[] args){
        PriorityQueue<Integer> priorityOne = new PriorityQueue<>();
        priorityOne.add(1);
        priorityOne.add(3);
        priorityOne.add(5);
        priorityOne.add(2);
        priorityOne.add(4);
        System.out.println("priority queue is: "+ priorityOne);
        int removeOf = priorityOne.remove();
        System.out.println(removeOf);
        int clearOf = priorityOne.size();
        System.out.println(clearOf);
        priorityOne.poll();
        System.out.println("final Queue: "+priorityOne);
    }
}
