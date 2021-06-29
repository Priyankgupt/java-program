/* Priyank Gupta B.tech CSE(SE)
 Printing an array into Zigzag fashion. 
 Suppose you were given an array of integers, and you are told to sort the integers in a zigzag pattern.
  In general, in a zigzag pattern, the first integer is less than the second integer, which is greater than the third integer, which is less than the fourth integer, and so on. 
  Hence, the converted array should be in the form of e1 < e2 > e3 < e4 > e5 < e6.
	Test cases:	
		Input 1:
		7
		4 3 7 8 6 2 1
		Output 1:
		3 7 4 8 2 6 1
		Input 2:
		4
		1 4 3 2
		Output 2:
		1 4 2 3
*/
package prg;
import java.util.Scanner;
public class problem5 
{                                                 
	public static void main (String args[])
	{                                       
		Scanner sc = new Scanner(System.in);
		int n, i;
		System.out.println(" Enter the length of an array : ");
		n = sc.nextInt();                   
		int arr[] = new int[n];
		System.out.println(" Enter the elements of the array : ");
		for(i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();     
		}
		System.out.println(" Original array : ");
		for(i = 0; i < n; i++)
		{
			System.out.print(" " + arr[i] + " "); 	
		}
		System.out.println();
		boolean flag = true;
		int temp = 0;
		for(i = 0; i < n - 1; i++)
		{                     
			if(flag)
			{
				if(arr[i] > arr[i+1])
				{
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			else
			{
				if(arr[i] < arr[i+1])
				{
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]=temp;
				}
			}
			flag =!flag;
		}
System.out.println(" The rearranged array in zig-zag form is : ");
		for(i = 0; i < n; i++)
		{                        //displaying the rearranged array
			System.out.print(" " + arr[i] + " ");
		}
		sc.close();
	}                                          
}
