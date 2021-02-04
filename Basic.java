public class Basic {
		void fun1(){
			System.out.println("In-Fun");
		}

		void fun2(int x){
			System.out.println("x is: " + x);
		}

		int fun2(int x, int y){
			int z = x+y;
			return z;
		}

		void fun3(int var){
			System.out.println("var is: " + var);
		}
}

class RunApp {
	public static void main(String[] args) {
		Basic b = new Basic();
		b.fun1();

		b.fun2(10);

		int result = b.fun2(10,20);

		b.fun3(result);

		//System.out.println("Result is : " + b.fun2(10,20));
	}
}
