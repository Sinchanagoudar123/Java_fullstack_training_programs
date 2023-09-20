//String demo
package collection;

public class StringDemo {

	public static void main(String[] args) {
		char c[]= {'I','N','D','I','A'};
		String s1=new String(c);
		String s2=new String(s1);
		System.out.println(s1);
		System.out.println(s1);
		
	}

}
//String Operations
package collection;

public class StringOperDemo {
	public static void main(String[] args) {
		String s1=new String("India");
		String s2=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.length());
		System.out.println(s1.substring(2,5));
		System.out.println(s1.trim());
		System.out.println(s1.strip());
		System.out.println(s1.isEmpty());
		s1="Good Morning";
		s2=new String(s1);
		System.out.println(s1+"equals"+s2+"---->"+s1.equals(s2));
		System.out.println(s1==s2);
	}
}
//String Buffer
package collection;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("Hello");
		System.out.println("Buffer:"+buffer);
		System.out.println("Buffer length:"+buffer.length());
		System.out.println("Buffer capacity:"+buffer.capacity());
        //append and Insert
		String S;
		int a=42;
		buffer=new StringBuffer(40);
		S=buffer.append("a=").append(a).append("!").toString();
		System.out.println(S);
		System.out.println(buffer);
		buffer=new StringBuffer("I JAVA!!");
		buffer.insert(2,"Like");
		System.out.println(buffer);
		System.out.println(buffer.reverse());
	}

}
