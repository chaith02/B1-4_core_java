package annotation;
import java.lang.annotation.*;

@Inherited
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
 
@interface CustomAnnotation
{
    String value();
}
 
@CustomAnnotation(value = "Sky is limitless")
class Super {
}

public class ex5_1 extends Super {
	public static void main(String[] arg) throws Exception
    {
        System.out.println(new ex5_1().getClass().getAnnotation(CustomAnnotation.class));
        //System.out.println(new Super().getClass().getAnnotation(CustomAnnotation.class));
 
        @SuppressWarnings("rawtypes")
		Class obj = Super.class;
 
        printAnnotationState(obj);
    }

	private static void printAnnotationState(@SuppressWarnings("rawtypes") Class obj) {
		// TODO Auto-generated method stub
		
	}

}
