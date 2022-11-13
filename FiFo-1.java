
import java.util.*;
public class FIFO {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("486");		/// adding values
        queue.add("294");
        queue.add("352");
        queue.add("965");
        queue.add("169");
        System.out.println("--------------------------------------------------------");
        System.out.println("Created Queue: \t" + queue);
        System.out.println("The element deleted from the head is: \t" + queue.remove());
        System.out.println("The queue after deletion: \t" + queue);	
        System.out.println("The head of the present queue is: \t" + queue.peek());		
        System.out.println("The size of the queue is: \t" + queue.size());
    }
}
