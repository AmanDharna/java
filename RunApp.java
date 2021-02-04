import java.util.*;

public class Calculator {
	int z;

	int addition(int x1, int y1){
		z = x1+y1;
		return z;
	}

	int subtraction(int x, int y){
		z = x-y;
		return z;
	}

	void multiplication(int x, int y){
		z = x*y;
		System.out.println("Multiplication is: " + z);
	}

	void division(int x, int y){
		z = x/y;
		System.out.println("Division is: " + z);
	}
}

class RunApp {
	public static void main(String[] args){
		int x,y,result;
		String str;

		Calculator c = new Calculator();

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose Operation from (+ , - , * , /)");

		str = sc.nextLine();
		 // to take string values from user

		switch(str){
			case "+":
				System.out.println("Enter value of x");
				x = sc.nextInt();
				System.out.println("Enter value of y");
				y = sc.nextInt();
				result = c.addition(x,y);
				System.out.println("Addition is: " + result);
			break;

			case "-":
				System.out.println("Enter value of x");
				x = sc.nextInt();
				System.out.println("Enter value of y");
				y = sc.nextInt();
				result = c.subtraction(x,y);
				System.out.println("Subtraction is: " + result);
			break;

			case "*":
				System.out.println("Enter value of x");
				x = sc.nextInt();
				System.out.println("Enter value of y");
				y = sc.nextInt();
				c.multiplication(x,y);
			break;

			case "/":
				System.out.println("Enter value of x");
				x = sc.nextInt();
				System.out.println("Enter value of y");
				y = sc.nextInt();
				c.division(x,y);
			break;

			default:
				System.out.println("No Value");
			break;

		}
	}
}
