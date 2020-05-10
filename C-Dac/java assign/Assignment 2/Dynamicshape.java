/*create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle","Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function.
*/

abstract class Shape
{
	abstract public void draw();
}

class Triangle extends Shape
{
	public void draw()
	{
	 System.out.println("In Triangle");
	}
}

class Polygon extends Shape
{
	public void draw()
	{
	 System.out.println("In Polygon");
	}
}

class Circle extends Shape
{
	public void draw()
	{
	 System.out.println("In Circle");
	}
}

public class Dynamicshape
{

     public static void main(String args[])
	{
		 Shape s[] = new Shape[3];
		s[0] = new Triangle();

		s[1] = new Polygon();

		s[2] = new Circle();
		
		for(int i=0; i< 3; i++)
			s[i].draw();
		
	}

}