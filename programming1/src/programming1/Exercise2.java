package programming1;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		printQuestion1();
		printQuestion2();
		printQuestion3();
		printQuestion4();
		printQuestion5();
		printQuestion6();
		printQuestion7();
		printQuestion8();
		printQuestion9();
		printQuestion10();
		
		sc.close();
		
	}
	
	public static void printQuestion1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two integer number ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int product = num1*num2;
		System.out.print("Your product of two numbers are " +product +".");
		sc.close();
	}
	
	public static void printQuestion2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input any number: ");
		int num = sc.nextInt();
		int cal1 = num*1;
		int cal2 = num*2;
		int cal3 = num*3;
		int cal4 = num*4;
		int cal5 = num*5;
		int cal6 = num*6;
		int cal7 = num*7;
		int cal8 = num*8;
		int cal9 = num*9;
		int cal10 = num*10;
		System.out.println("The answer for number entered and multiply upto 10: ");
		System.out.println(num +"x 1 = " +cal1);
		System.out.println(num +"x 2 = " +cal2);
		System.out.println(num +"x 3 = " +cal3);
		System.out.println(num +"x 4 = " +cal4);
		System.out.println(num +"x 5 = " +cal5);
		System.out.println(num +"x 6 = " +cal6);
		System.out.println(num +"x 7 = " +cal7);
		System.out.println(num +"x 8 = " +cal8);
		System.out.println(num +"x 9 = " +cal9);
		System.out.println(num +"x 10 = " +cal10);
		sc.close();
	}
	
	public static void printQuestion3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of a circle: ");
		double rad = sc.nextDouble();
		double perimeter = (2*3.142*rad);
		double area = (3.142*rad*rad);
		System.out.printf("\nPerimeter: " +"%.2f", perimeter);
		System.out.printf("\nArea: " +"%.2f", area);
		sc.close();
	}
	
	public static void printQuestion4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int average = (num1+num2+num3)/3;
		System.out.print("The average of three numbers are " +average +".");
		sc.close();
	}
	
	public static void printQuestion5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter width and length of rectangle: ");
		double width = sc.nextDouble();
		double length = sc.nextDouble();
		double perimeter = 2*(width+length);
		double area = width*length;
		System.out.print("Perimeter of rectangle, 2*(" +width +"+" +length +") = " +perimeter +"\nArea of rectangle, " +width +"*" +length +" = " +area);
		sc.close();
	}
	
	public static void printQuestion6() {
		Scanner sc = new Scanner(System.in);
		
		int c;
		
		System.out.print("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before swapping: a = " +a +", b = " +b);
		c = a;
		a = b;
		b = c;
		System.out.println("After swapping: a = " +a +", b = " +b);
		sc.close();
	}
	
	public static void printQuestion7() {
		System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
	}
	
	//SKIP
	public static void printQuestion8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your password (must be in 10 characters): ");
		String password = sc.next();
		System.out.print("\nYour password: **********");
		System.out.print("\nDo you want to see the password you entered?: ");
		boolean answer = sc.nextBoolean();
		if(answer == true) { 
			System.out.print("Your password is " +password +".");}
		else if(answer == false) {
			System.out.print("We will keep your password.");}
		sc.close();
	}
	
	public static void printQuestion9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num2 > num1 && num3 > num2) {
			System.out.print("\nFirst number: " +num1 +"\nSecond number: " +num2 +"\nThird number: " +num3 +"\nTrue.");
		}
		else if(num2 < num1 && num3 > num2) {
			System.out.print("\nFirst number: " +num1 +"\nSecond number: " +num2 +"\nThird number: " +num3 +"\nFalse.");
		}
		else {
			System.out.print("\nFirst number: " +num1 +"\nSecond number: " +num2 +"\nThird number: " +num3 +"\nFalse.");
		}
		sc.close();
	}
	
	//SKIP
	public static void printQuestion10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1+num2;
		if (sum == num3) {
			System.out.print("\nFirst number: " +num1 +"\nSecond number: " +num2 +"\nThird number: " +num3 +"\nTrue.");
		}
		else {
			System.out.print("\nFirst number: " +num1 +"\nSecond number: " +num2 +"\nThird number: " +num3 +"\nFalse.");
		}
	}
}
