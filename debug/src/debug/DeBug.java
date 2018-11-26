package debug;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
@Retention(RetentionPolicy.RUNTIME)
public @interface DeBug {
	String name();
	String value();
}
