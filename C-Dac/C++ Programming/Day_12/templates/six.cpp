//using a standard parameter with template function
#include<iostream.h>
template<class T>
void bubble(T *p,int size)
{
	T temp;
	int i,j;
	for(i=0;i<size-1;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(p[i]>p[j])
			{
				temp=p[i];
				p[i]=p[j];
				p[j]=temp;
			}
		}
	}
}
void main()
{
	int arr[5]={4,1,5,8,6};
	int i=0;
	cout<<endl<<"before swapping\n";
	for(i=0;i<5;i++)
	{
		cout<<arr[i]<<endl;
	}
	bubble(arr,5);
	cout<<endl<<"after swapping\n";
	for(i=0;i<5;i++)
	{
		cout<<arr[i]<<endl;
	}
}








