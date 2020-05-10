using System;
class propertyexample
{

int _height=20;
int _width;

public int Height
{
	get {return _height;}

	

}

public int Width
{


set{

	if(value<=0)
	Console.WriteLine("-ve and 0 not allowed");
	else

	_width=value;}
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

	 propertyexample obj= new propertyexample();
	
	Console.WriteLine(obj.Height);
    
Console.WriteLine("enter widtht");
	obj.Width=int.Parse(Console.ReadLine());

 	int ans=obj.area();
	Console.Write(ans);
Console.ReadLine();

	}

}