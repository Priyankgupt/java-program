/*Priyank Gupta B.tech CSE(SE)
 	Java Program to count all the occurrences of 0(1+)0 patterns in a string 
 	String examples: 010, 0110, 010110
 */
package prg;
import java.util.Scanner;
public class problem9
{                                                             
	public static void main(String[] args) 
	{                                                  
	    String n;  
	    int c, count = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a string:");
	    n = sc.nextLine();                                      
	    n.trim();
	    int x;
	    for(int i = 0; i < n.length() - 1; i++)
	    {
	       c=n.charAt(i);
	       if(c =='0' && n.charAt(i+1) =='1')
	       {
	         for(int j=i+1;;)
	          {
	           x = n.charAt(j);
	           if(x =='1')
	              j++;
	           else if(x=='0')
	             {
	              count = count + 1;
	              break;
	             }
	           }
	        }
	     }
	    System.out.println(count);
	    sc.close();
	 }                                                  
}   
