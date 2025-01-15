import java.lang.reflect.Method;

public class Main {
  @SimpleAnnotation(name = "Paul", age = 3)
  public static void main(String[] args) {
    Class<?> clazz = Main.class; // could also use getClass() with an instantiated class object

    for (Method method : clazz.getMethods()) {
      SimpleAnnotation simpleAnnotation = method.getAnnotation(SimpleAnnotation.class);

      if (simpleAnnotation != null) {
        if (!simpleAnnotation.name().isEmpty()) {
          System.out.println(simpleAnnotation.name());
        } else if (!simpleAnnotation.value().isEmpty()) {
          System.out.println(simpleAnnotation.value());
        }

        if (simpleAnnotation.age() > 0) {
          System.out.println(simpleAnnotation.age());
        }
      }
    }
  }
}
