/*	Priyank Gupta B.tech CSE(SE)
 Concepts of Java Control statements, Conditional statements, loops and iterations, Wrapper classes, Scanner Class
	Using the switch statement, write a menu-driven program to calculate the maturity amount of a bank deposit.
	The user is given the following options:
		(i) Term Deposit
		(ii) Recurring Deposit
			For option (i) accept Principal (p), rate of interest (r) and time period in years (n). 
				Calculate and output the maturity amount (a) receivable using the formula a = p[1 + r / 100]n.
			For option (ii) accept monthly installment (p), rate of interest (r) and time period in months (n). Calculate and output the maturity amount (a) receivable using the formula a = p * n + p * n(n + 1) / 2 * r / 100 * 1 / 12.
			For an incorrect option, an appropriate error message should be displayed.
[ Use Scanner Class to take input ]
 */
package prg;
import java.util.Scanner;
public class problem2
{                                                 
	public static void main (String args[]) 
	{                                      
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1. Term Deposit");
		System.out.println(" 2. Recurring Deposit");
		System.out.println(" Choose your op
		double p, r, n, a;
		switch(ch)
		{                                  
		   case 1: System.out.println(" Enter principal= ");
			      p=sc.nextDouble();
			      System.out.println(" Enter Rate of interest=");
			      r=sc.nextDouble();
			      System.out.println(" Enter time in years= ");
			      n=sc.nextDouble();
			      a=p*(1 + r/100)*n;
			      System.out.println(" Maturity amount= "+a);
			      break;
	       case 2: System.out.println("Your monthly installment=");
		          p=sc.nextDouble();
		          System.out.println(" Enter Rate of interest= ");
		          r=sc.nextDouble();
		          System.out.println(" Enter time in months= ");
		          n=sc.nextDouble();
		          a=p*n + (p*n/2*(n+1))*(r/1200);
		          System.out.println(" Maturity amount= "+a);
                   break;
		}                                   
     sc.close();                 
	}                                       
}
