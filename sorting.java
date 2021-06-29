/* Priyank Gupta B.tech CSE(SE)
 	The problem to rearrange positive and negative numbers in an array . 
	Method: This approach moves all negative numbers to the beginning and positive numbers to the end but changes the order of appearance of the elements of the array.
Steps:
1.	Declare an array and input the array elements.
2.	Start traversing the array and if the current element is negative, swap the current element with the first positive element and continue traversing until all the elements have been encountered.
3.	Print the rearranged array.
Test case:
	Input:     1 -1 2 -2 3 -3
	Output:   -1 -2 -3 1 3  2
*/
package prg;
import java.util.Scanner;
public class problem6
{                                                  
    void rearrangepositions(int arr[], int n)
     {                                             
       int i,j;
       j = 0;
       for(i = 0; i < n; i++)
       {                                    
          if(arr[i] < 0)
             {
                if(i != j)
                 {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                 }
                j++;
             }
        }
}                                           
public static void main(String[] args)
 {                                          
    Scanner sc = new Scanner(System.in);     
    int n, i;
    System.out.println(" Enter number of elements:");
    n = sc.nextInt();                   	
    int arr[] = new int[n];
    System.out.println(" Input the array elements : ");
    for(i = 0; i < n; i++)
    {
        arr[i] = sc.nextInt(); 				 
    }
    System.out.println(" Original array : ");
    for(i = 0; i < n; i++)
     {                         				 
        System.out.print( " " + arr[i] + " ");
     }
    System.out.println();
    problem6 obj = new problem6();
    obj.rearrangepositions(arr, n);
    System.out.println(" Rearranged array : ");
    for(i = 0; i < n; i++)
    {                                 		 
       System.out.print( " " + arr[i] + " ");
    } 
    sc.close();
  }                                           
} 
