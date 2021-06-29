/* Priyank Gupta B.tech CSE(SE)
  Java Program to delete vowels from a string using String Buffer
 */
package prg;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class problem8
{                                                             
   static String deletevowel(String strVowel)
   {                                              
      Character[] vowel ={'a','e','i','o','u','A','E','I','O','U'};
      List<Character> li = Arrays.asList(vowel);
      StringBuffer strBuffer = new StringBuffer(strVowel);
      for(int a = 0; a < strBuffer.length(); a++)
      {                                                
         if(li.contains(strBuffer.charAt(a)))
         {
        	strBuffer.replace(a, a + 1, "");
            a--;
         }
      }
      return strBuffer.toString();
   }                                                                       
   public static void main(String[] args)
   {                                                     
	   Scanner sc = new Scanner(System.in); 
	   System.out.print(" Enter a string: ");
	   String strInput = sc.nextLine(); 
       System.out.println(deletevowel(strInput));
       sc.close();
   }                                                     
} 
