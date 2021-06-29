/* Priyank Gupta B.tech CSE(SE)
   Write a Java program to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods-
   		reactangleArea() taking two parameters
   		squareArea() and circleArea() taking one parameter
   Now create another class 'Area' containing all three methods reactangleArea(), squareArea() and circleArea() for printing the area of rectangle, square and circle respectively.
   Create an object of class Area and call all the three method.(Use Runtime Polymorphism).
 	*/

package prg;
import java.util.Scanner;
abstract class Shape
{
	int x,y;
	abstract void rectangleArea(double x, double y);
	abstract void squareArea(double x);
	abstract void circleArea(double x);
}
class Area extends Shape
{
	void rectangleArea(double x, double y)
	{
		System.out.println("");
		System.out.println("  Area of Rectangle= " + (x*y));
	}
	void squareArea(double x)
	{
		System.out.println("  Area of Square= " + (x*x));
	}
	void circleArea(double x)
	{
		System.out.println("  Area of Circle= " + (x*x*3.14));
	}
}
public class program13
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length and breadth of rectangle: ");
		int l = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("");
		System.out.print("Enter side of square: ");
		int s = sc.nextInt();
		System.out.println("");
		System.out.print("Enter radius of circle: ");
		int r = sc.nextInt();
		Area a = new Area();
		a.rectangleArea(l, b);
		a.squareArea(s);
		a.circleArea(r);
		sc.close();
	}

}
