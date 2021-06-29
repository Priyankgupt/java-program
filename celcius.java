/* Priyank GuptaB.tech CSE(SE)
  
   Java Program to implement abstract class and methods with following details:
   		Create an abstract base class Temperature with following attributes:
   			Data Members:
   				double temp
   			Method Members:
   				void setTempData()
   				abstract void changeTemp()
   			Sub-class Fahrenheit with following details:
   				Data Members:
   					double fTemp
   				Method members:
   					Override abstact method changeTemp() to convert Fahrenheit temperature to degree Celsius using formula:
   						C = (5/9)*(F-32) and display the converted temperature.
   			Sub-class Celsius with following details:
   				Data Members:
   					double cTemp
   				Method members:
   					Override abstact method changeTemp() to convert Celsius temperature to degree Fahrenheit using formula:
   						F = (9/5)*(C+32) and display the converted temperature.
 */

package prg;
import java.util.Scanner;
abstract class Temperature
{
	double temp;
	void setTemp(double temp)
	{
		this.temp = temp;
	}
	abstract void changeTemp(double temp);
}
class Fahrenheit extends Temperature
{
	double fTemp;
	void changeTemp(double temp)
	{
		this.fTemp = temp;
		System.out.println("  Temperature in Fahrenheit: " + temp);
		double celsius = ((5) * (temp - 32)/9);
		System.out.println("  Temperature in Celsius: " + celsius);
	}
}
class Celsius extends Temperature
{
	double cTemp;
	void changeTemp(double temp)
	{
		this.cTemp = temp;
		System.out.println("  Temperature in Celsius: " + temp);
		double fahrenheit = ((9) * (temp)/5) + 32;
		System.out.println("  Temperature in Fahrenheit: " + fahrenheit);
	}
}
public class program14
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  Fahrenheit f = new Fahrenheit();
	  System.out.print(" Enter temperature in degree Fahrenheit: ");
	  double ft = sc.nextDouble();
	  f.changeTemp(ft);
	  Celsius c = new Celsius();
	  System.out.print(" Enter temperature in degree Celsius: ");
	  double ct = sc.nextDouble();
	  c.changeTemp(ct);
	  sc.close();
	}
}
