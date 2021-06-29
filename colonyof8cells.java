/*	Priyank gupta B.Tech CSE 2nd Year
There is a colony of 8 cells arranged in a straight line where each day every cell competes with its adjacent cells (neighbour). Each day, for each cell, if its neighbours are both
active and both inactive, the cell becomes inactive the next day, otherwise it becomes active the next day.
	Assumptions: The two cells on the ends have single adjacent cell, so the other adjacent cell can be assumed to be always inactive.
				 Even after updating the cell state. Consider its previous state for updating the state of other cells. Update the cell information of all cells simultaneously.
	Write a function cell Compete which takes one 8 element array of integer’s cells representing the current state of 8 cells and one integer days representing the number of days to simulate.
  	An integer value of 1 represents an active cell and value of 0 represents an inactive cell.
		
	Test Cases
		TESTCASES 1:
			INPUT: [1,0,0,0,0,1,0,0],1		
			EXPECTED RETURN VALUE: [0,1,0,0,1,0,1,0]
		TESTCASE 2:
			INPUT: [1,1,1,0,1,1,1,1,],2
			EXPECTED RETURN VALUE: [0,0,0,0,0,1,1,0]
*/
package prg;
import java.util.Scanner;
public class colonyof8cells {

	public static void main(String[] args) throws java.lang.Exception
	{
		try {
			Scanner sc = new Scanner(System.in);
		    int[] cell = new int[8];
		    int[] ref = new int[8];
		    System.out.println(" Enter states of cells: ");
		    for(int i=0;i<8;i++) {
		       cell[i] = sc.nextInt();
		    }
		    System.out.println(" Enter number of days to simulate: ");
		    int day = sc.nextInt();
		    while(day-->0){
		    for(int i=1;i<7;i++){
		        if(cell[i-1] == cell[i+1]){
		            ref[i] = 0;
		        }else{
		            ref[i] =1;
		        }
		    }
		    if(cell[1] == 1){
		        ref[0] = 1;
		    }else{
		        ref[0] = 0;
		    }
		    
		    if(cell[6]==1){
		        ref[7] = 1;
		    }else{
		        ref[7] = 0;
		    }
		    
		    for(int j=0;j<8;j++){
		        cell[j] = ref[j];
		    }
		    
		    }
		    System.out.println(" Output states: ");
		    for(int i=0; i<8; i++)
		    	System.out.print(" " + cell[i] + " ");	
			sc.close();
		}
		catch(Exception e) {
		}
	}

}
