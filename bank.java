/* Priyank Gupta B.tech CSE(SE)
 
  	Concepts of Class Definition, Creating Objects and Constructors
  	Java Program to create a class Bank with the following data members:-
  		name of depositor
  		address of depositor
  		account number
  		balance in account
   The class has methods for the following:-
   		Generate a unique account number for each depositor .
   		Display information and balance of depositor.
   		Deposit more amount in balance of any depositor.
   		Withdraw some amount of balance deposited.
   		Change address of the depositor.
   		
 */
package prg;
import java.util.Scanner;
public class program10Bank
{                                                  
    private int accno;
    private String nameofdepositor,addressofdepositor;
    private double balanceamount;
    program10Bank(int x,String y,String z,double k)
     {                                 
         accno=x;
         nameofdepositor=y;
         addressofdepositor=z;
         balanceamount=k;  
     }
     void displayinfo()
      {                               
         System.out.println("Account number of depositor: "+accno);
         System.out.println("Name of depositor: "+nameofdepositor);
         System.out.println("Address of depositor: " + addressofdepositor);
         System.out.println("Balance amount :"+balanceamount);
      }                                 
      void depositamount(double amt1)
      {                                   
         balanceamount=balanceamount+amt1;
         displayinfo();
      }                                      
      void withdrawamount(double amt2)
      {                                  
          balanceamount=balanceamount-amt2;
          displayinfo();
      }                                   
      void changeadd(String chngadd)
      {                                       
          addressofdepositor=chngadd;
          displayinfo();
      }                                   
      public static void main(String[] args)
      {                                      //start of main method
         Scanner sc=new Scanner(System.in);
         int a;
         String b,c;
         double d;
         System.out.println("Enter account number:");
         a=Integer.parseInt(sc.nextLine());
         System.out.println("Enter name of depositor:");
         b=sc.nextLine();
         System.out.println("Enter address of depositor:");
         c=sc.nextLine();
         System.out.println("Enter balance in amount:");
         d=sc.nextDouble();
         program10Bank obj=new program10Bank(a,b,c,d);
         obj.displayinfo();
         int choice;
         System.out.println("Enter choice: "); 
         System.out.println("1.for withdrawal"); 
         System.out.println("2. for deposit");
         System.out.println("3. for change of address");
         choice = sc.nextInt();
         if(choice==1)
            {                                  
                double depo;
                System.out.println("Enter amount to deposit:");
                depo=sc.nextDouble();
                obj.depositamount(depo);
            }                  
         else if(choice==2)
            {
                double depo2;
                System.out.println("Enter amount to withdraw:");
                depo2=sc.nextDouble();
                obj.withdrawamount(depo2);
            }
         else if(choice==3)
            {
                String add;
                System.out.println("Enter new address:");
                add=sc.nextLine();
                obj.changeadd(add);
            }
         sc.close();
        }                                  
} 
