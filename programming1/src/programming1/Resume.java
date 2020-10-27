package programming1;

import java.util.Scanner;

public class Resume {

	public static void main(String[] args) {
		
		printName();
		printAge();
		printGender();
		printBirthday();
		printStatus();
		printCitizenship();
		printAddress();
		printHP();
		printGrade();
		printCGPA();
		printExperience();
		printLanguage();
		printSkills();
		
		
	}
  
	public static void printName(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you name: ");
		String name = sc.next();
		System.out.println("Name: " +name);
		sc.close();
	}
	
	public static void printAge(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter your age: ");
		int age = sc.nextInt();
		System.out.println("Age: " +age);
		sc.close();
	}
	
	public static void printGender(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your gender: ");
		char gender = sc.next().charAt(0);
		System.out.print("Your gender is ." +gender);
		sc.close();
	}
  
	public static void printGrade(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter your STIA1113 grade: ");
		char grade = sc.next().charAt(0);
		System.out.println("STIA1113 grade: " +grade);
		sc.close();
	}
  
	public static void printCGPA(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter your first semester GPA: ");
		double gpa1 = sc.nextDouble();
		System.out.print("Enter your second semester GPA: ");
		double gpa2 = sc.nextDouble();
		System.out.println("Your first and second semester GPA are " +gpa1 +" and " +gpa2 +" respectively.");
    
		double cgpa = ((gpa1+gpa2)/8.00)*4.00;
    
		System.out.println("\nYour CGPA is " +cgpa +".");
		
		sc.close();
	}
	
	public static void printStatus(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marital status: ");
		String status = sc.next();
		System.out.println("Marital status: " +status);
		sc.close();
	}
	
	public static void printCitizenship(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your citizenship:  ");
		String citizen = sc.next();
		System.out.println("Citizenship: " +citizen);
		sc.close();
	}
	
	public static void printAddress(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your address (separate by three lines): ");
		System.out.print("First line: ");
		String add1 = sc.nextLine();
		System.out.print("Second line: ");
		String add2 = sc.nextLine();
		System.out.print("Third line: ");
		String add3 = sc.nextLine();
		System.out.print("Your address is: \t" +add1 +",\n\t\t\t" +add2 +",\n\t\t\t" +add3 +".");
		sc.close();
	}
	
	public static void printHP(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phone number: ");
		String hp = sc.next();
		System.out.println("Your phone number is " +hp);
		sc.close();
	}
	
	public static void printBirthday(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your birthday: ");
		String birthday = sc.next();
		System.out.println("Yor birthday is " +birthday);
		sc.close();
	}
	
	public static void printExperience(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your (2) work experience(s): ");
		String work1 = sc.nextLine();
		String work2 = sc.nextLine();
		System.out.println("Work Experince: \t" +work1 +"\n\t\t\t" +work2);
		sc.close();
	}
	
	public static void printLanguage(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter language you good at: ");
		String lang1 = sc.nextLine();
		String lang2 = sc.nextLine();
		String lang3 = sc.nextLine();
		System.out.println("Your address is \t1. " +lang1 +"\n\t\t\t2. " +lang2 +"\n\t\t\t3. " +lang3 +".");
		sc.close();
	}
	
	public static void printSkills(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your professional skill: ");
		String skill1 = sc.nextLine();
		String skill2 = sc.nextLine();
		String skill3 = sc.nextLine();
		System.out.println("Your address is \t1. " +skill1 +"\n\t\t\t2. " +skill2 +"\n\t\t\t3. " +skill3 +".");
		sc.close();
	}
}