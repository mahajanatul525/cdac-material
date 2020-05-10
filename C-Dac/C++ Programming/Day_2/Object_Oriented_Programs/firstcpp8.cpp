#include<iostream>
using namespace std;
/* destructor is a special member function,called when the object goes out of scope 
if not defined explicitly ,it is provided implicitly by compiler.
special because
a) same name as classname,preceded by ~ sign
b) no return type
c) called automatically when object goes out of scope (stack based object)
d) it can not be overloaded
*/

class MyClass
{
	private:
		int num;
	public:
		void setNum(int);
		int getNum();
		/*MyClass()
		{
			cout<<"\ninside def.constructor\n";
		}*/
		MyClass();
		MyClass(int);
		~MyClass();
};
MyClass::MyClass()
{
	cout<<"in side def constructor but outside class\n";
}
MyClass::MyClass(int k)
{
	num=k;
	cout<<"in parameterized constructor\n";
}
MyClass::~MyClass()
{
	cout<<"\ninside destructor"<<num<<endl;
}
void MyClass::setNum(int k)
		{
			this->num=k;
		}
int  MyClass::getNum()
		{
			return num;
		}
void main()
{
	MyClass m;
	m.setNum(100);
	cout<<endl<<m.getNum()<<endl;
	MyClass m1(45);
	cout<<endl<<m1.getNum()<<endl;
}









