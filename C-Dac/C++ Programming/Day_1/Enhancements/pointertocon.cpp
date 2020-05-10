#include<iostream>
using namespace std;
int main()
{
	int num=10;
	const int *ptr=&num; //pointer to a constant
	cout<<endl<<num<<endl;
	cout<<endl<<*ptr<<endl;
//	*ptr=40; // Error 
	ptr++; // no error

	int * const ptr1=&num;  // constant pointer
	cout<<endl<<*ptr1<<endl;
	*ptr1=100;
	cout<<endl<<num<<"\t"<<*ptr1<<endl;
//	ptr1++;  // Error 
	int num1=20;
	const int * const ptr2=&num1; //constant pointer to a constant
	cout<<endl<<*ptr2<<endl;
	//*ptr2=30; Error
 //	ptr2++; Error
}