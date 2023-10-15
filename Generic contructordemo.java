package generics;

public class GenericConstructorDemo {

	public static void main(String[] args) {
		System.out.println("Number to double conversion");
		GenericConstructor obj=new GenericConstructor(10);
        obj.show();
        GenericConstructor obj1=new GenericConstructor(1136.8F);
        obj1.show();
	}

}
