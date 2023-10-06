package annotation;
import java.lang.annotation.*;
public class AnnotationDemo {

	public static void main(String[] args) {
		AndroidSeries obj=new AndroidSeries("A23",14);
		System.out.println(obj.model);
		System.out.println(obj.ScreenSize);
		System.out.println("Smart tv details");
		
		@SuppressWarnings("unchecked")
		
		Class c=obj.getClass();
		@SuppressWarnings("unchecked")
		Annotation an1=c.getAnnotation(SmartTv.class);
		SmartTv s1=(SmartTv)an1;
		System.out.println(s1.Os());
		System.out.println(s1.height());
		System.out.println(s1.width());

	}

}
