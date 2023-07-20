//Coding Practice - 1.6
//6) Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
import java.util.Scanner;
class kgm
{
	public static void main(String args[])
	{
	   	Scanner getinput = new Scanner(System.in);
		System.out.println("Input First Number : ");
		int firstNumber = getinput.nextInt();
		System.out.println("Input Second Number : ");
		int secondNumber = getinput.nextInt();
		int sum = firstNumber + secondNumber;
		int difference = firstNumber - secondNumber;
		int product = firstNumber * secondNumber;
		int division = firstNumber / secondNumber;
		int mod = firstNumber % secondNumber;
		System.out.println("Sum of two numbers is : "+ sum);
		System.out.println("Sum of two numbers is : "+ difference);
		System.out.println("Sum of two numbers is : "+ product);
		System.out.println("Sum of two numbers is : "+ division);
		System.out.println("Sum of two numbers is : "+ mod);
	}
}