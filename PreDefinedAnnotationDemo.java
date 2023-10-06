package annotation;

import java.util.*;

public class PreDefinedAnnotationDemo {
  @SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  @SuppressWarnings("raw typed")
		List a1=new ArrayList();
		Student s2=new Student(102,"Neha","ISE");
		a1.add(10);
		a1.add(22.22f);
		a1.add(new Student(101,"Nitya","ISE"));

	}

}
