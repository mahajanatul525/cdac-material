#include<stdio.h>
#include<conio.h>

int main()
{
	puts("hello");
	//disp(23.5); // even if it works during compile-time, it won't work during runtime.
	fun(); // it will work during runtime also
}
int fun()
{
	puts("inside fun");
	return 0;
}
int x;
cin>>x;

getch();
