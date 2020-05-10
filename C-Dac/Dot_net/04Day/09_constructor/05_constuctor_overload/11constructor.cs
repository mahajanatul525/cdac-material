using System;

class constexample
{

public int _height;
public int _width;



public int area()
{  int a;
	a=_height*_width;
	return a;
}

}

class entryclass
{

	static void Main()
	{

	constexample obj= new constexample(); // compiler will provide default 
constructor(parameterless)

         obj._height=7;
	obj._width=8;

 	int ans=obj.area();

	Console.Write(ans);

Console.ReadLine();

	}

}