import java.util.*;
class Day3
{
	public static void main(String args[]){
	/*
	 System.out.println("<---------------------------Type casting widening--------------------------->");
	 int a = 5;
	 double b = a;//Automatic casting from int into double it's called as widening.
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println("<---------------------------Type casting narrowing--------------------------->");
	 double c = 10.25d;
	 int d = (int) c;//Automatic casting from int into double it's called as narrowing.
	 System.out.println(c);
	 System.out.println(d);
	
	 System.out.println("<---------------------------IF ELSE--------------------------->");
	 Scanner verify = new Scanner(System.in);
	 System.out.println("Enter Your age : ");
	 int age = verify.nextInt();
	 if(age >= 18)
	 {
	   System.out.println("You are eligiable to vote");
	 }
	 else
	 {
	   System.out.println("You are not eligiable to vote");
	 }*/
	 /*Output
	 Enter Your age :
	 19
	 You are eligiable to vote
	 */
	 
	
	 /*
	System.out.println(" Sum of 110 add 200 is : " + add(110, 200));
       System.out.println(" Sum of 0 and 0 is : " + add(0, 0));
       System.out.println(" Sum of -10 and +10 is : " + add(-10, 10));
       System.out.println(" Sum of -10 + 200 is : " + add(-10, 200));
       System.out.println(" Sum of 0 + 200 is : " + add(0, 200));
 	  */
     
    



        /* System.out.println("<---------------------------IF ELSE IF LADDER--------------------------->");
	 Scanner verifymark = new Scanner(System.in);
	 System.out.println("Enter Your mark : ");
	 int mark = verifymark.nextInt();
	 if((mark > 0 && mark < 40))
	 {
	   System.out.println("Your grade is D");
	 }
	 else if((mark >= 40 && mark <= 59))
	 {
	   System.out.println("Your grade is C");
	 }
	 else if((mark >= 60 && mark <= 79))
	 {
	   System.out.println("Your grade is B");
	 }
	 else if((mark >= 80 && mark <= 89))
	 {
	   System.out.println("Your grade is A");
	 }
	 else if((mark >= 90 && mark <= 100))
	 {
	   System.out.println("Your grade is O");
	 }
	 else{
	   System.out.println("Enter a valid number from 0-100");
	 }
         */
		 

	 /*System.out.println("<---------------------------NESTED IF--------------------------->");
	 Scanner verify = new Scanner(System.in);
	 System.out.println("Enter Your age : ");
	 int age = verify.nextInt();
	 if(age >= 17)
	 {
	   System.out.println("Enter Your percentage : ");
	   int premark = verify.nextInt();
	       if(premark >= 60)
	       {
	          System.out.println("You are eligiable to join contact HR");
	       }
	       else{
	         System.out.println("You does not match the required percentage");   
	       }
 	  }
	  else 
	  {
	   System.out.println("Your age does not match the required age");
	  }
	  */
	  
         /*System.out.println("<-------------------------SWITCH STATEMENT----------------------------->");
	 Scanner week = new Scanner(System.in);
	 System.out.println("Enter numbers from 0 to 7 : ");
	 int day = week.nextInt();
	 switch(day){
	  case 1:
	    System.out.println("Day 1 is Sunday");
	  break;
	  case 2:
	    System.out.println("Day 2 is Monday");
	  break;
	  case 3:
	    System.out.println("Day 3 is Tuesday");
	  break;
	  case 4:
	    System.out.println("Day 4 is Wednesday");
	  break;
	  case 5:
	    System.out.println("Day 5 is Thursday");
	  break;
	  case 6:
	    System.out.println("Day 6 is Friday");
	  break;
	  case 7:
	    System.out.println("Day 7 is Saturday");
	  break;
	  default:System.out.println("Enter only 0-7");
	 }
         */

         /*System.out.println("<-------------------------NESTED IF--------------------------->");
	 if(age >= 17)
	 {
	   System.out.println("Enter Your percentage : ");
	   int premark = verify.nextInt();
	       if(premark >= 60)
	       {
	          System.out.println("You are eligiable to join contact HR");
	       }
	       else{
	         System.out.println("You does not match the required percentage");   
	       }
 	  }
	  else 
	  {
	   System.out.println("Your age does not match the required age");
	  }
          */


	  int term = 6;  
	  for(int i = 1; i <= term; i++){  
	     for(int j = term; j >= i; j--){  
                System.out.print("* ");  
              }  
  	  System.out.println();  
          }  








	}		
}

