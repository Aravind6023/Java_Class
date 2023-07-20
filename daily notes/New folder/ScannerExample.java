import java.util.Scanner;

class ScannerExample{



public static void main(String args[]){

Scanner sc = new Scanner(System.in);
 
System.out.println("Enter your first name : ");


String firstName = sc.nextLine();
System.out.println("Enter your age : ");
int value = sc.nextInt();
System.out.println("Enter your last name : ");
char lastName = sc.next().charAt(0);
System.out.println("Your name is : " + firstName);
System.out.println("Your initial is : " + lastName);
System.out.println("Your Age is : " + value);





}
}