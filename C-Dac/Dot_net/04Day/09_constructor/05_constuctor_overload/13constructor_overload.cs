using System;

class constexample
{

int _height;
int _width;


public constexample()
{
Console.WriteLine("cons parameterless");

}


public constexample(int h,int w)
{
_height =h;
_width=w;

Console.WriteLine("cons with parameter{0} {1}", _height,_width);
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
	{ constexample ob=new  constexample();
	
	 constexample obj= new constexample(5,7);
         
 	int ans=obj.area();
	Console.Write(ans);
     Console.ReadLine();

	}

}