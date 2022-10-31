package FiFo;
import java.util.LinkedList;		/*  	Name :- Shivam Bendre		Roll No:- COTA16 			Division:- "A1"    */
import java.util.Queue;
public class FiFo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.add("486");		/// adding values
        queue.add("294");
        queue.add("352");
        queue.add("965");
        queue.add("169");
        System.out.println("Created Queue: " + queue);
        String value = (String) queue.remove();		
        //   removing start element of queue 
        System.out.println("The element deleted from the head is: " + value);
        System.out.println("The queue after deletion: " + queue);	
        ///printing the queue after removing 1st element
        String head = (String) queue.peek();
        System.out.println("The head of the present queue is: " + head);		
        // queue start element
        int size = queue.size();
        System.out.println("The size of the queue is: " + size);		// printing queue size
    }
}