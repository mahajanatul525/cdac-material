namespace sp1
{
	template<class type>
	class myclass
	{
		type a;
		public:
			myclass(type a)
			{
				this->a=a;
			}
			void disp()
			{
				cout<<a<<endl;
			}
	};
}
namespace sp2
{
	template<class type1,class type2>
	class myclass
	{
		type1 a;
		type2 b;
		public:
			myclass(type1 a,type1 b)
			{
				this->a=a;
				this->b=b;
			}
			void disp()
			{
				cout<<a<<"\t"<<b<<endl;
			}
	};
}


