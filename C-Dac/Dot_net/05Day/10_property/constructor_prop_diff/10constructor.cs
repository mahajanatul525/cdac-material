using System;

public class constructorexample
{

int _height;
int _width;
public constructorexample()
{}

public constructorexample(int h,int w)
{
if(h<=0)
Console.WriteLine("errh");
else
_height=h;
if(w<=0)
Console.WriteLine("errw");
else

_width=w;



}

public int area()
{

	int a;
	a=_height*_width;
	return a;

}

}

class entryclass
{

	static void Main()
	{

	 constructorexample obj= new constructorexample();


	Console.WriteLine("enter height");
	string w=Console.ReadLine();

    int a= int.Parse(w); ;
	
	

	Console.WriteLine("enter widtht");
	int b=int.Parse(Console.ReadLine());

	constructorexample obj1= new constructorexample(a, b);	
 	int ans=obj1.area();
	Console.Write(ans);
Console.ReadLine();

	}

}