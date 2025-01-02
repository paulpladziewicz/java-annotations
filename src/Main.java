import java.lang.reflect.Method;

public class Main {

    @SimpleAnnotation(name = "Paul", value = 3)
    public static void main(String[] args) {
        Class<?> clazz = Main.class; // could also use getClass() with an instantiated class object

        for (Method method : clazz.getMethods()) {
            SimpleAnnotation simpleAnnotation = method.getAnnotation(SimpleAnnotation.class);

            if (simpleAnnotation != null) {
                System.out.println(simpleAnnotation.name());
                System.out.println(simpleAnnotation.value());
            }
        }
    }
}