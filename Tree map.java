package collection;
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		SortedMap<String,String>sm=new TreeMap<String,String>();
		sm.put("Father","farmer");
		sm.put("Mother","Teacher");
		sm.put("Son","Engineer");
		sm.put("Daughter","Doctor");
		sm.put("Cousin","Manager");
		System.out.println(sm);
		for(SortedMap.Entry m:sm.entrySet()) {
			System.out.println(sm.firstKey()+" "+sm.lastKey());
		}
	}
}

package collection;
import java.util.*;
public class TreeDemo2 {
	public static void main(String[] args) {
		SortedMap<Integer,String>sm=new TreeMap<Integer,String>();
		sm.put(3, "three");
		sm.put(2, null);
		sm.put(1, "one");
		sm.put(4, "four");
		sm.put(6, "null");
		sm.put(5, "five");
		System.out.println(sm);
  }
}

package collection;
import java.util.*;
public class NavigableDemo {
	public static void main(String[] args) {
		NavigableMap<Integer,String>httpcode=new TreeMap<Integer,String>();
		httpcode.put(302,"God");
		httpcode.put(300,"Save");
		httpcode.put(400,"Bad");
		httpcode.put(200,"Ok");
		httpcode.put(404,"NotFound");
		System.out.println(httpcode);
		System.out.println(httpcode.pollFirstEntry());
		System.out.println(httpcode.pollLastEntry());
		System.out.println(httpcode);
		System.out.println(httpcode.firstEntry());
		System.out.println(httpcode.lastEntry());	
  }
}

package collection;
import java.util.*;
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String>li_hash_map=new LinkedHashMap<Integer,String>();
		li_hash_map.put(10,"Good");
		li_hash_map.put(15,"4");
		li_hash_map.put(20,"Good");
		li_hash_map.put(25,"Welcomes");
		li_hash_map.put(30,"Set");
		System.out.println(li_hash_map);
		System.out.println(li_hash_map.containsKey(20));
		System.out.println(li_hash_map.containsKey(5));
  }
}


package collection;
import java.util.*;
public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer,String>table=new Hashtable<Integer,String>();
		table.put(10, "layer");
		table.put(15, "line");
		table.put(20, "space");
		table.put(25, "size");
		Enumeration enu=table.elements();
		System.out.println("The Enumeration Of values are:");
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
	}
}
