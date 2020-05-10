#include<iostream.h>
#include<string.h>
class MyClass
{
private:
	char *name;
public:
	MyClass(char *ptr)
	{
		name=new char[strlen(ptr)+1];
		strcpy(name,ptr);
	}
	void disp()
	{
		cout<<endl<<name<<endl;
	}
	char operator[](unsigned int x)
	{
		if(x>=0 && x <=(strlen(name)-1))
		{
			return name[x];
		}
		else
		{
			return 0;
		}
	}
};
void main()
{
	MyClass m1("sachin");
	m1.disp();
	cout<<endl<<"initial of sachin is\n";
	cout<<endl<<m1[0]<<endl;
}