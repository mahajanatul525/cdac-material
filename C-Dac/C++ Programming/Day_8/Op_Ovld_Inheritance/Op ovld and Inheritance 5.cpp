#include <iostream.h>
class base
{
private:
	int a;
public:
	base(int k)
	{
		a=k;
	}
	base()
	{
	}
	void disp()
	{
		cout<<"Value of a is\t"<<a<<endl;
	}
};
class sub:public base
{
private:
	int b;
public:
	sub(int k,int l):base(l)
	{
		b=k;
	}
	void disp()
	{
		cout<<"Value of b is\t"<<b<<endl;
	}
	void operator=(sub &s)
	{
		cout<<"in operator= of sub"<<endl;
		b=s.b;
		base::operator=(s);
	}
};
void main()
{
	sub s1(5,10),s2(15,20);
	s1=s2;
	s1.disp();
	s1.base::disp();

}

/*in the above code, sub class operator= invokes
 parent class operator= function*/
