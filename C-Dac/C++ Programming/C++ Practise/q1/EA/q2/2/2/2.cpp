/*#include<iostream>
#include<string>
using namespace std;
void disp()
{
	cout<<"enter the word"<<endl;
	string word;
	cin>>word;
	if(word.length()>=3 && word.length()<=5)
		cout<<word;
	else
	{
		cout<<"error..."<<endl;\
			exit(0);
	}
}
int main()
{
	disp();
	return 0;
}*/

/*#include<iostream>
#include<string>
using namespace std;
struct Book{
	char bid[5];
	char name[30];
	int price;
};

int main(){
	int rec;
	cout<<"Enter no. of records u want to insert?...";
	cin>>rec;
	Book *b = new Book[rec]; // initialize struc variable 
	for (int i = 0; i < rec; i++)
	{
		cout<<"Enter book no. for "<<(i+1)<<endl;
		cin>>b[i].bid;
		cout<<"Enter book name. for "<<(i+1)<<endl;
		cin>>b[i].name;
		cout<<"Enter price for "<<(i+1)<<endl;
		cin>>b[i].price;
	}
	for (int i = 0; i < rec; i++)
	{
		cout<<b[i].bid<<b[i].name<<b[i].price<<endl;
	}
	return 0;
}*/

/*#include<iostream>
using namespace std;

struct Book{
	int price;
}b = {100};

Book& test(){
	return b;
}

int main(){
	cout<<"reference of structure...";
	Book &b1 = test();
	cout<<b1.price<<endl;
	return 0;
}

*/
/*
#include<iostream>
using namespace std;

int disp(int,int*,int&);

int disp(int a, int *b, int& c){
	cout<<"value of a is "<<a<<endl;
	cout<<"value of b is "<<b<<endl;
	cout<<"value of c is "<<c<<endl;

	return a;
}
int main(){
	int n,num1 = 10,*ptr;
	int& ref = num1;
	ptr = &num1;
	//call by value...
	//n = disp(12,ptr,ref);

	//call by reference...
	n = disp(12,ptr,ref);
	//call by address...

	//n= disp();
	return 0;
}
*/

/*
#include<iostream>
using namespace std;
struct struct1{
	int member1;
};
struct struct2{
	int member2;
};
struct struct3{
	int member3;
};
int func(struct1&);
int func(struct2&,int);
int func(struct3&,int,int);

int func(struct1& a){
	int ans = a.member1;
	return ans*2;
}

int func(struct2& a, int b){
	int ans = a.member2 + b;
	return ans;
}

int func(struct3& a,int b, int c){
	int ans = a.member3+ b +c;
	return ans;
}

int main(){
	struct1 abc;
	struct2 pqr;
	struct3 xyz;
	int num,res;
	abc.member1 = 1001;
	pqr.member2 = 2002;
	xyz.member3 = 3003;
	res = func(abc);
	cout<<"result of struct 1 is "<<res<<endl;

	res = func(pqr,10);
	cout<<"result of struct 2 is..."<<res<<endl;

	res = func(xyz,10,20);
	cout<<"result of struct 3 is..."<<res<<endl;
	
	return 0;
}
*/
/*#include<iostream>
using namespace std;
void Swap(int&,int&);
int main()
{
	int a,b,res;
	cout<<"enter a & b";
	cin>>a>>b;
	Swap(a,b);
	return 0;
}
void Swap(int &a,int &b)
{
	int temp;
	temp=a;
	a=b;
	b=temp;
	cout<<a<<"\t"<<b;
}*/
/*
#include<iostream>
#include<string>
using namespace std;

class Book
{
	private:
		int bookid, price;
		char* bookname;

	public:

	Book(int a){
		
	}


	~Book(){
		cout<<"i m in destructor"<<a<<endl;
	}

	int getBookId(int id){
		return id;
	}

	string getBookName(){
		
	}

	int getBookPrice(){
		
	}
};

int main(){
	Book b1 = 
	return 0;
}*/
/*
#include<iostream>
using namespace std;
class MyClass1{
	private:
	public:
		void disp1(){
			cout<<"In class m1..."<<endl;
		}
};

class MyClass2{
	public:
		void disp2(){
			cout<<"In class m2..."<<endl;
			MyClass1 m1;
			m1.disp1();	
		}
};

int main(){
	MyClass2 m2;
	m2.disp2();
	return 0;
}*/

#include<iostream>
using namespace std;

class Car{
private:
	
public:
 static int count;
	Car(){
		cout<<"in  no arg constructor...!!"<<endl;	
		count++;
	}

	Car(int n){
		cout<<"in one parameter constructor..."<<endl;
		count++;
	}
	Car(int n,int o){
		cout<<"in two parameter constructor..."<<endl;
		count++;
	}
	Car(int n, int o, int p){
		cout<<"in three parameter constructor..."<<endl;
		count++;
	}
	~Car(){
		cout<<"I m crashed!!"<<endl;
		int n = getCount();
		cout<<"total cars..."<<n<<endl;
	}
	int getCount(){
		return count++;
	}
};

int main(){
	int no;
	cout<<"Enter how many recors u want?..."<<endl;
	cin>>no;
	Car *BMW = new Car();
	Car *Jaguar = new Car(12000);
	Car *Swift = new Car(1500,200);
	Car *Audi = new Car(22000,555,222);
	return 0;
}