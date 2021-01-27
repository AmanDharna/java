import java.lang.reflect.Field;

class Example {
  int x,y;

  void show() {
    System.out.println("Hello");
  }
}

class RunApp {
  public static void main(String[] args) {
    Example e = new Example();
    e.show();
    Class c = e.getClass();
    System.out.println(c.getName());
  }
}
