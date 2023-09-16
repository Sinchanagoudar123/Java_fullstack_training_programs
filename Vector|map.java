package collection;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		Vector<String>animals=new Vector<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		System.out.println("Initial Vector:"+animals);
		//get method
		String element=animals.get(2);
        System.out.println("Get:"+element);
        //using iterator
        Iterator<String>it=animals.iterator();
        System.out.println("vector:");
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        //remove
        element=animals.remove(1);
        System.out.println("Removed element:"+element);

	}

}

package collection;
import java.util.*;
public class MapDemo {
     public static void main(String []args) {
    	 Map<Integer,String>map=new HashMap<Integer,String>();
    	 System.out.println(map);
    	 map.put(96, "Dinesh");
    	 map.put(80, "Merin");
    	 map.put(100, "Swathi");
    	 System.out.println(map); 
     }
}


package collection;
import java.util.*;
public class MapDemo2 {

	public static void main(String[] args) {
		Map<String,String>map=new HashMap<String,String>();
		map.put("First", "Way");
		map.put("Second", "Gate");
		map.put("Third", "Wall");
		map.put("Fourth", "Person");
		System.out.println(map);

	}

}

package collection;
import java.util.*;
public class MapDemo3 {
	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(null, "MNC");
		map.put(null, "TCS");
		map.put(null, "Google");
		map.put(1004, "CTS");
		map.put(7005, "Vitrusa");
		System.out.println(map);
	}
}
