using System;

class propertyexample
{

int _height=1;
int _width=1;

public int Height
{
	get {return _height;}

	set{
	if(value<=0)
	{
	Console.WriteLine("-ve and 0 not allowed");

	}
	else
	_height=value;}

}

public int Width
{
get {return _width;}

set{

	if(value<=0)
	Console.WriteLine("-ve and 0 not allowed");
	else

	_width=value;}
}

public int area()
{

	int a;
	a=Height*Width;
	return a;

}

}

class entryclass
{

	static void Main()
	{

	 propertyexample obj= new propertyexample();


	Console.WriteLine("enter height");
	string w=Console.ReadLine();

    obj.Height = int.Parse(w); ;
	
	

	Console.WriteLine("enter widtht");
	obj.Width=int.Parse(Console.ReadLine());

 	int ans=obj.area();
	Console.Write(ans);
Console.ReadLine();

	}

}