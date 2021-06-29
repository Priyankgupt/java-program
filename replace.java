/*Priyank Gupta B.tech CSE(SE)
   Program to replace all 0's with 1 in a given integer. Given an integer as an input, all the 0's in the number has to be replaced with 1.
		For example, consider the following number
			Input: 102405
			Output: 112415
			Input: 56004
			Output: 56114
Steps to replace all 0's with 1 in a given integer
	Input the integer from the user.
	Traverse the integer digit by digit.
	If a '0' is encountered, replace it by '1'.
	Print the integer
 */
package prg;
import java.util.Scanner;
public class problem4
{                                             
  public static void main(String[] args)
  {                                           
   Scanner sc = new Scanner(System.in);      
   System.out.print("Enter the number : ");		
   int number = sc.nextInt();                
   String str = Integer.toString(number);     
   int len = str.length();
   String str1 = "";
  for(int i = 0 ; i < len ; i++)
  {                               			  
    	if(str.charAt(i) == '0')
    		str1 = str1 + '1';
    	else
    		str1 = str1 + str.charAt(i);	
  }
  System.out.println("Output : "+str1);
  sc.close();	                           
    }                                         
}   
