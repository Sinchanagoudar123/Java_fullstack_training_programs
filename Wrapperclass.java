//wrapperclass
package wrapperclass;

public class WrapperClassDemo {

	public static void main(String[] args) {
		Integer i1=new Integer(100);
		System.out.println(i1);
		System.out.println(i1.toString());
		Integer i2=new Integer(1000);
		System.out.println(i2);
		System.out.println(i2.toString());
	}

}

package wrapperclass;

public class WrapperClassDemoOne {

	public static void main(String[] args) {
		Integer i1=new Integer(100);
		Integer i2=new Integer(1000);
		System.out.println(i1+i2);
		
		String str1=i1.toString();
		String str2=i2.toString();
		System.out.println(str1+str2);

	}

}

package wrapperclass;

public class WrapperClassDemoTwo {

	public static void main(String[] args) {
		System.out.println("Hello world");
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a+b;
		System.out.println(c);
	}

}

package wrapperclass;

public class WrapperClassDemoThree {

	public static void main(String[] args) {
		Integer i1=new Integer(100);
		System.out.println(i1);
		Integer a1=Integer.valueOf(10);
		System.out.println(a1);
	}

}

//BoxingDemo

package wrapperclass;

public class BoxingDemo {

	public static void main(String[] args) {
		Integer i=new Integer(10);
		System.out.println(i);  //unbox
		int b=i.intValue();
		System.out.println(b);
		int a=100;
		Integer i1=a;
		System.out.println(i1);
	}

}
//object class Demo
package wrapperclass;
class Sample{

}
class Demo{
	public
		Demo(){
		System.out.println("In Constructor");
	}
	@Override
	protected
	      void finalize()throws Throwable{
		//resource cleanup code
		System.out.println("In finalize");
	}
}
public class ObjectClassDemo {

	public static void main(String[] args) {
	  Sample S=new Sample();
	  Sample s1=new Sample();
	  System.out.println(S.getClass().getName());
	  System.out.println(S.hashCode());
	  System.out.println(s1.hashCode());
	  Demo d=new Demo();
	  System.out.println(d.hashCode());
	  //Demo d1=d;
	  d=null;
	  System.gc();

	}
}
