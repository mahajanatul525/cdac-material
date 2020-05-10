#include<stdio.h>
void main()
{ int i=3;
int *j,**k,*p;
j=&i;
k=&j;p=j;
printf("\n address of i=%u",&i);	//1245052

printf("\n value of i=%d",i);		//3
printf("\n value of *(&i)=%d",*(&i));	//3

printf("\n address of &j=%u",&j);	//1245048

printf("\n value of j (is addres of i)=%u",j);	//1245052

printf("\n value of j=%u",*j);		//3

printf("\n value of k(is address of j)%u",k);

printf("\nvalue at address k is address of i=%u",*k);

printf("\n value%d\t",**k); *j=9; printf("%d",i);//9 pf("%d",*p);9

}




























