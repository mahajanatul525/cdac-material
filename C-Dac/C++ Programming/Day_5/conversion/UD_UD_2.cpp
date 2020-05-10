// in source casting operator
#include<iostream.h>
class Rupee
{
private:
	int rup;
public:
	Rupee()
	{
		rup=0;
	}
	Rupee(int k)
	{
		rup=k;
	}
	void disp()
	{
		cout<<endl<<"rupee is\t"<<rup<<endl;
	}
	int getRupee()
	{
		return rup;
	}
};
class Paise
{
private:
	int pai;
public:
	Paise()
	{
		pai=0;
	}
	Paise(int k)
	{
		pai=k;
	}
	int getPai()
	{
		return pai;
	}
	void disp()
	{
		cout<<endl<<"paise  is\t"<<pai<<endl;
	}
	operator Rupee()
	{
		Rupee r(pai/100);
		return r;
	}
};
void main()
{
	Rupee r(100);
	Paise p(20000);
	r.disp();
	p.disp();
	r=p;
	r.disp();
}
