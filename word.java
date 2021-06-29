/*Priyank Gupta B.techjh CSE(SE)
 
  Define a class Word Example having following description:
  Data Member/Instance Variables:
  		private String strdata: to store a sentence
  Parameterized Constructor:
  		WordExample(String): Accepts a sentence which may be terminated by either’.’, ‘? ’or ’!’ only. 
  							 The words may be separated by more than one blank space and are in UPPER CASE.
  Member Methods:
		void countWord(): Find the number of words beginning and ending with a vowel.
		void placeWord(): Place the words which begin and end with a vowel at the beginning, followed by the remaining words as they occur in the sentence.
		*/
package prg;
import java.util.Scanner;
public class problem11WordExample 
{                                                 
    private String strdata;
    problem11WordExample(String m)
    {                                      
        int len=m.length();
        char ch=m.charAt(len-1);
        if(ch=='!' || ch=='.' || ch=='?')
        {                            
            strdata=m;
        }
        else{
            System.out.println("Invalid Input !");
        }

    }
    void countWord()
    {                                   
        String wd="";
        char c=' ';
        int i,len=strdata.length(),count=0;
        for(i=0;i<len;i++)
        {         //counting words starting and ending with vowels
            c=strdata.charAt(i);
            if(c!=' ')
            {
                wd=wd+c;
            }
            else
             {
                String w="aeiouAEIOU";
                char l1=wd.charAt(0),l2=wd.charAt(wd.length()-1);
                if((w.indexOf(l1)!=-1) && (w.indexOf(l2)!=-1))
                {
                    count=count+1;
                }
                wd="";
             }
        }
        System.out.println(count);
    }                                     
    void placeWord()
    {                                  
        String word=" ",word2=" ";
        char c=' ';
        int i,len=strdata.length();
        for(i=0;i<len;i++)
        {                              
          c=strdata.charAt(i);
          if(c!=' ')
          {
              word=word+c;
          }
          else
          {
            String w="aeiouAEIOU";
            char l1=word.charAt(0),l2=word.charAt(word.length()-1);
                if((w.indexOf(l1)!=-1) && (w.indexOf(l2)!=-1))
                {
                   word2=word+word2;
                }
                else{
                    word2=word2+word;
                }
                word="";
            }
        }
        System.out.println(word2);
    }                                    
    public static void main(String[] args)
    {                                        
            Scanner sc=new Scanner(System.in);
            String inputword="";
            System.out.println(" Enter a sentence:");
            inputword=sc.nextLine();
            problem11WordExample obj = new problem11WordExample(inputword);
            obj.countWord();
            obj.placeWord();
            sc.close();
    }                                          
}
