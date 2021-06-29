/*  Priyank Gupta B.tech CSE(SE)
	Java program to create an interface that consists of a method to display volume () as an abstract method and redefine this method in the derived classes to suit their requirements.
	Create classes called Cone, Hemisphere and Cylinder that implements the interface. Using these three classes, design a program that will accept dimensions of a cone, cylinder and hemisphere interactively and display the volumes.
		Volume of cone = (1/3)(pi)(r^2)h
		Volume of hemisphere = (2/3)(pi)r^3 
		Volume of cylinder = (pi)(r^2)h
*/
package prg;
interface xyz
{    
	 void input();
     void volume();
}
class Cone implements xyz
{
    int r = 0, h = 0;
    double pi = 3.14, ar = 0;
    public void input()
    {
        r = 5;
        h = 5;
    }
    public void volume()
    {
        ar = (pi * r * r * h)/3;
        System.out.println("Volume of Cone:"+ ar);
    }
}
class Hemisphere extends Cone
{
    int r = 0;
    double ar = 0, pi = 3.14;
    public void input()
    {
        super.input();
        r = 5;
    }
    public void volume()
    {
        super.volume();
        ar =  ((pi * r * r * r)*2)/3 ;
        System.out.println("Volume of Hemisphere:"+ar);
    }
}
class Cylinder extends Hemisphere
{
    int r = 0, h = 0;
    double ar = 0, pi = 3.14;
    public void input()
    {
        super.input();
        r = 5;
        h = 5;
    }
    public void volume()
    {
        super.volume();
        ar = pi * r * r * h;
        System.out.println("Volume of Cylinder:"+ar);
    }
}
public class problem15
{
    public static void main(String[] args)
    {
        Cylinder obj = new Cylinder();
        obj.input();
        obj.volume();       
        
    }
}
