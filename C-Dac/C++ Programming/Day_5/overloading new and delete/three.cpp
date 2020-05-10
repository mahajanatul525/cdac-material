#include<iostream>
#include<malloc.h>
using namespace std;
void* operator new(size_t num, char x)
{
    char *ptr;
	if (ptr =(char*) malloc(num))
	{
		*ptr=x;
	}
    return ptr;
}
void* operator new(size_t num, int x)
{
    int *ptr;
	if (ptr =(int*) malloc(num))
	{
		*ptr=x;
	}
    return ptr;
}

int main()
{
    	char *p = new('*') char;
	cout<<"char data is\t"<<*p<<endl;
	int *p1=new (100)int;
	cout<<"int data is\t"<<*p1<<endl;
}

























