import java.lang.reflect.*;
class Example {
	int x,y;
	void show() {
		System.out.println("Hello World");
		System.out.println("Hello World");
	}
}

class RunApp {
	public static void main(String[] args) {
		Example e = new Example();
		Class c1 = e.getClass();
		Method m[] = c1.getDeclaredMethods();

		for(Method method : m) {
			System.out.println(method.getName());
		}

		Field f[] = c1.getDeclaredFields();

		for(Field field : f) {
			System.out.println(field.getName());
		}

		e.show();
		System.out.println(c1.getName());
	}
}
