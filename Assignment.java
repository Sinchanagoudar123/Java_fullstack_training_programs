//Problem 1

package asignment;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        // Read and enqueue elements
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            queue.offer(element);
        }

        int searchElement = scanner.nextInt();

        // Print the initial queue elements
        System.out.print("Queue elements: ");
        for (int element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Remove the element from the queue
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        // Print the queue after removing the head element
        System.out.print("Queue after removing head element: ");
        for (int element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Print the head of the queue
        int head = queue.peek();
        System.out.println("Head of the queue: " + head);

        // Print the size of the queue
        int queueSize = queue.size();
        System.out.println("Size of the queue: " + queueSize);

        // Print the status of the searched element
        if (queue.contains(searchElement)) {
            System.out.println(searchElement + " is in the queue.");
        } else {
            System.out.println(searchElement + " is not in the queue.");
        }

        scanner.close();
	}

}

//Problem 2
package asignment;
import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        int n = scanner.nextInt(); // Number of names
	        scanner.nextLine(); // Consume newline character

	        Set<String> uniqueNames = new HashSet<>();
	        Map<String, Integer> frequencyMap = new HashMap<>();

	        // Read and store unique names while counting their frequencies
	        for (int i = 0; i < n; i++) {
	            String name = scanner.nextLine().trim();
	            uniqueNames.add(name);
	            frequencyMap.put(name, frequencyMap.getOrDefault(name, 0) + 1);
	        }

	        String searchName = scanner.nextLine().trim();

	        // Print the frequency of the searched element
	        int frequency = frequencyMap.getOrDefault(searchName, 0);
	        System.out.println("Frequency of " + searchName + ": " + frequency);

	        scanner.close();
	}

}

//problem 3
package asignment;
import java.util.*;
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String,Integer>map=new HashMap<String,Integer>();
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
        	String name=input.next();
        	int rollno=input.nextInt();
        	map.put(name, rollno);
        }
        String SearchName=input.next();
        int newRollno=input.nextInt();
        System.out.println("original Map");
        System.out.println(map);
        if (map.containsKey(SearchName)){
        	map.put(SearchName, newRollno);
        }
        System.out.println("After change");
        System.out.println(map);
        
	}

}
