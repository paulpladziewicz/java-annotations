import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SimpleAnnotation {
    String value() default ""; // person's name, default attribute if one value passed
    String name() default ""; // defaults help avoid null checks
    int age() default -1;
}