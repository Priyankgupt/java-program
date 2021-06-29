/* Priyank Gupta B.tech CSE(SE)
 	Create a class MyCalculator which consists of a single method power(int, int).
	This method takes two integers, n and p, as parameters and finds np .
	If either n or p  is negative, then the method must throw an exception which says "n and p should be non-negative". 
 			Input Format: Each line of the input contains two integers, n and p . 
			Output Format: Each line of the output contains the result ,if neither of n and  p is negative. 
						   Otherwise the output contains "n and p should be non-negative". 
		Sample Input:
					 3 5 
					 2 4
					 0 0
					 -1 -2
					 -1 3 
		Sample Output:  
					  243 	
  					  16
		 java.lang.Exception: n and p should not be zero.
		 java.lang.Exception: n or p should not be negative.
		 java.lang.Exception: n or p should not be negative.
 * */
package prg;
import java.util.Scanner;

class myCalculator{
    int power(int n, int p) throws Exception{
        if(n<0 || p<0)
            throw new Exception("n and p should be non-negative");
        return (int)Math.pow((double)n,(double)p);
    }
}

class program17{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt())
        {
            int n = sc.nextInt();
            int p = sc.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println("  "+M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        sc.close();
    }
}
