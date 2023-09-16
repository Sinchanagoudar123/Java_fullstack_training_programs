package Collection;
import java.util.*;
public class QueueDemo{
  public static void main(String [] args){
    Queue<Integer>queue=new LinkedList<Integer>();
    //Add the elements 
    for(int i=0;i<5;i++)
      {
        queue.add(i);
      }
    System.out.println("Elements in the Queue are:"+queue);
    //remove the head element
    int removed=queue.remove();
    System.out.println("Removed element:"+removed);
    System.out.println("Elements in the Queue are:"+queue);
    int head=queue.peak();
    System.out.println("Head Elements in the Queue:"+head);
    int size=queue.size();
    System.out.println("Size of the queue:"+size);
  }
}

package collection;
import java.util.*;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<String>pq=new PriorityQueue<>();
		//core Java,React,HTML,Angular
		pq.add("core Java");
		pq.add("React");
		pq.add("HTML");
		pq.add("Angular");
		System.out.println(pq);
		pq.remove("Angular");
		System.out.println("After Remove:"+pq);
		System.out.println("Poll Method"+pq.poll());
		System.out.println("Final Queue:"+pq);
		Iterator<String>iterator=pq.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"");
		}
		
	}

}


package collection;
import java.util.*;
public class DequeueDemo {
 public static void main(String[]args) {
	 Deque<Integer>deque=new ArrayDeque<>();
	 deque.addFirst(21);
	 deque.addLast(05);
	 System.out.println(deque);
 }
}
