import java.util.ArrayDeque;
import java.util.Deque;

public class dequeClass {
    public static void main(String[] args){
        Deque<Integer> dequeOne = new ArrayDeque<>();
        for(int i=1; i<5; i++){
            dequeOne.add(i);
        }
        System.out.println("Deque is: "+dequeOne);
        dequeOne.addFirst(0);
        dequeOne.addLast(5);
        System.out.println("After First and Last adding: "+dequeOne);
        System.out.println("getting first number: "+ dequeOne.getFirst());
        System.out.println("getting last number: "+ dequeOne.getLast());
        int peekNumF = dequeOne.peekFirst();
        int peekNumL = dequeOne.peekLast();
        System.out.println("peek first: "+peekNumF);
        System.out.println("peek last: "+peekNumL);
        System.out.println("poll first: "+dequeOne.pollFirst());
        System.out.println("poll last: "+dequeOne.pollLast());
        System.out.println("remove from last: "+ dequeOne.removeLast());
    }
}
