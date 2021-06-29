/* Priyank Gupta B.tech CSE(SE)
   Concepts of Method overloading (Compile time Polymorphism)
   Java program to create a class called ArrayDemo and overload arrayFunc() function.
		void arrayFunc(int [], int): To find all pairs of elements in an Array whose sum is equal to a given number :
			Array numbers= [4, 6, 5, -10, 8, 5, 20], 
			target=10 
			Output : 
			Pairs of elements whose sum is 10 are : 
			4 + 6 = 10
			 5 + 5 = 10
			 -10 + 20 = 10
		void arrayFunc(int A[], int p, int B[], int q): Given two sorted arrays A and B of size p and q, Overload method arrayFunc() to merge elements of A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.
			Example: 
			Input :
			 int[] A = { 1, 5, 6, 7, 8, 10 } 
			int[] B = { 2, 4, 9 } 
			Output: 
			Sorted Arrays: 
			A: [1, 2, 4, 5, 6, 7] 
			B: [8, 9, 10]
(Use Compile time Polymorphism Method Overloading)
*/
package prg; 
import java.util.Scanner;
public class problem12ArrayDemo 
{                                                 
    void arrayFunc(int arr[],int num)
    {
        int len = arr.length;
        int i,j;
        System.out.println(" Pairs of elements whose sum is " + num + " are:");
        for(i = 0; i < len ; i++)
        {                  
            for(j = i + 1; j < len; j++)
            {
                if((arr[i] + arr[j]) == num)
                {
                    System.out.println("   "+arr[i]+"+"+arr[j]+"="+num);
                }
            }
        }
    }                                    
    void arrayFunc(int A[],int p,int B[],int q)
    {                                   
        int len1 = A.length,len2=B.length;
        int len3 =len1+len2;
        int C[] = new int[len3];
        int k = 0,z = 0, i, j, temp;
        for( i = 0; i < len3; i++)
        {
            if(i<len1)
            {
                C[i]=A[k];
                k++;
            }
            else
            {
                
                C[i]=B[z];
                z++; 
            }
        }
        for(i=0;i<len3;i++){
            for(j=0;j<len3-1-i;j++)
            {
                if(C[j]>C[j+1])
                {
                    temp=C[j];
                    C[j]=C[j+1];
                    C[j+1]=temp;
                }
            }
        }
        i=0;
        z=0;
        while(i<p)
        {
            A[i]=C[i];
            i++;
        }
        while(i<len3)
        {
            B[z]=C[i];
            i++;
            z++; 
        }
        //printing sorted array
        System.out.println(" ");
        System.out.println("  Sorted arrays:");
        System.out.print("   A: [");
        for(i=0;i<len1;i++)
        {
            System.out.print(A[i]+",");
        }
        System.out.print("]");
        System.out.println();
        System.out.print("   B: [");
        for(i=0;i<len2;i++)
        {
       System.out.print(B[i]+",");
        }
        System.out.print("]");
    }                                    	
    public static void main(String[] args)
    {                                              
    	Scanner sc = new Scanner(System.in);
    	problem12ArrayDemo  obj = new problem12ArrayDemo ();
        int brr[]={4,6,5,-10,8,5,20};
        System.out.print("Enter target: ");
        int n = sc.nextInt();
        obj.arrayFunc(brr, n);
        int  x[]={1,5,6,7,8,10};
        int  y[]={2,4,9};
        obj.arrayFunc(x, 6, y, 3);
        sc.close();
    }                                  
}    
