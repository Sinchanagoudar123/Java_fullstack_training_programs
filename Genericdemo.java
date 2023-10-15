package generics;

public class SpecificMethodDemo {

	public static void main(String[] args) {
		String[] strArray= {"ONE","TWO","THREE","FOUR","FIVE"};
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.0,2.0,3.0,4.0,5.0};
		displaystrArray(strArray);
		displayintArray(intArray);
		displaydoubleArray(doubleArray);
		

	}
	private static void displaystrArray(String[] strArray) {
		for(String s:strArray) {
			System.out.println(s);
		}
	}
	private static void displayintArray(Integer[] intArray) {
		for(Integer i:intArray) {
			System.out.println(i);
		}
	}
	private static void displaydoubleArray(Double[] doubleArray) {
		for(Double d:doubleArray) {
			System.out.println(d);
		}
	}

}

package generics;

public class GenericDemo {

	public static void main(String[] args) {
		String[] strArray= {"ONE","TWO","THREE","FOUR","FIVE"};
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.0,2.0,3.0,4.0,5.0};
		displayArray(strArray);
		displayArray(intArray);
		displayArray(doubleArray);
		

	}
	//generic method
	private static <T> void displayArray(T[] array) {
		for(T t:array) {
			System.out.println(t);
		}
	}

}

package generics;

public class GenericClassTest {

	public static void main(String[] args) {
		GenericClass<String> stringObj=new GenericClass<String>();
		stringObj.set("Hello");
		System.out.println(stringObj.get());
		
		GenericClass <Integer> personObj=new GenericClass<Integer>();
		personObj.set(new Integer(21));
		System.out.println(personObj.get());
	}

}

package generics;

public class GenericConstructor {
    private double v;
    //Generic Constructors
    public <T extends Number>GenericConstructor(T t){
    	v=t.doubleValue();
    }
    void show() {
    	System.out.println("Value of v in double type is :"+v);
    }
	

}

package generics;

public class GenericConstructorDemo {

	public static void main(String[] args) {
		System.out.println("Number to double conversion");
		GenericConstructor obj=new GenericConstructor(10);
        obj.show();
        GenericConstructor obj1=new GenericConstructor(1136.8F);
        obj1.show();
	}

}package generics;

public class GenericConstructorDemo {

	public static void main(String[] args) {
		System.out.println("Number to double conversion");
		GenericConstructor obj=new GenericConstructor(10);
        obj.show();
        GenericConstructor obj1=new GenericConstructor(1136.8F);
        obj1.show();
	}

}
