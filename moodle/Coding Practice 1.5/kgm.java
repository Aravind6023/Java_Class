//Coding Practice - 1.5
//5) Write a Java program that takes two numbers as input and display the product of two numbers. 
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
		int product = firstNumber * secondNumber;
		System.out.println("Product of two numbers is : "+ product);
	}
}