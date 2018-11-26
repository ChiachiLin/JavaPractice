package debug;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class DeBugTool {

	public static void main(String[] args) throws NoSuchMethodException{
		Class <Other> c =Other.class;
		Method method = c.getMethod("doOther");
		if(method.isAnnotationPresent(DeBug.class)) {
			System.out.println("已設定 @DeBug標註");
			DeBug debug = method.getAnnotation(DeBug.class);
			System.out.printf("name:%s%n",debug.name());
			System.out.printf("value:%s%n",debug.value());
		}else {
			System.out.println("沒有設定 @DeBug標註");
		}
		Annotation[] annotations =method.getAnnotations();
		for(Annotation annotation:annotations) {
			System.out.println(annotation.annotationType().getName());
		}
	}

}
