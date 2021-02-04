import java.util.*;

// Program of Addition
class Demo {
	void addition(int x, int y) { // method
		int z = x+y;
		System.out.println("Addition is " + z);
	}
	void subtraction(int x, int y) { // method
		int z = x-y;
		System.out.println("Addition is " + z);
	}
	void multiplication(int x, int y) { // method
		int z = x*y;
		System.out.println("Addition is " + z);
	}
	void division(int x, int y) { // method
		int z = x+y;
		System.out.println("Addition is " + z);
	}
}

public class Exe {
	public static void main(String[] args){
		int x,y;
		String str;
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose Operation: + , - , * , /");
		str = sc.nextLine();

		Demo d = new Demo();

		switch(str) {
			case "+":
				System.out.println("Enter x: ");
				x = sc.nextInt();
				System.out.println("Enter y: ");
				y = sc.nextInt();
				d.addition(x,y);
			break;
			case "-":
				System.out.println("Enter x: ");
				x = sc.nextInt();
				System.out.println("Enter y: ");
				y = sc.nextInt();
				d.subtraction(x,y);
			break;
			case "*":
				System.out.println("Enter x: ");
				x = sc.nextInt();
				System.out.println("Enter y: ");
				y = sc.nextInt();
				d.multiplication(x,y);
			break;
			case "/":
				System.out.println("Enter x: ");
				x = sc.nextInt();
				System.out.println("Enter y: ");
				y = sc.nextInt();
				d.division(x,y);
			break;
			default:
				System.out.println("No Value");
		}
		 // method calling (Modular Approach)
		//d.show();
	}
}

// d is a reference variable create in stack
// new Demo(); // object create in Heap (dynamic)

// single comment
/* multiple comment
	------
	------
*/
