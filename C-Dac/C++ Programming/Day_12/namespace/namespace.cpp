#include<iostream.h>
/*namespaces

purpose is to localize the names of identifiers to avoid name
 conflicts. c++ library has default namespace "std"
 */

namespace com_sun
{
	int i=10,j=20;
	class myclass
	{
	public:
		void disp()
		{
			cout<<i<<"\t"<<j<<endl;
		}
	};
}
namespace com_oracle
{
	class myclass
	{
	public:
		void disp()
		{
			cout<<endl<<"in disp of myclass of com_oracle"<<endl;
		}
	};
}
void main()
{
	com_sun::myclass m1;
	m1.disp();
	cout<<endl<<com_sun::i<<"\t"<<com_sun::j<<endl;
	com_oracle::myclass m2;
	m2.disp();
}