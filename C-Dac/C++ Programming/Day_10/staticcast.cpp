#include<iostream>
#include<typeinfo>
using namespace std;
/* static_cast
performs a non-polymorphic cast.it can be used for any standard
conversion. no routine checks are performed.

  static_cast<type>(expr)

  type specifies target type of the cast and expr is the expr.
  being cast into a new type.
*/

class base
{
};
class sub1:public base
{
};
class myclass
{
};
void main()
{
	int i;
	for(i=0;i<10;i++)
	{
		cout<<static_cast<double>(i)/3<<endl;
	}


	base *b=new base;
	myclass *m=(myclass*)b;
//	myclass *m=static_cast<myclass *>(b);
	
}
