#include<stdio.h>
void change(int*);
void main()
{
int no;
printf("enter a no to change val");
scanf("%d",&no); 5
printf("before call %d",no);
 change(&no);
 printf("after call %d",no);
}
void change(int *x)
{*x+=5;
printf("in function %d",*x);
}



void main()
{int a,b,;
 a=2;
  b=3;
change(&a,&b);
}
void change(int *a,int *b)
{
int t;
t=*a;
*a=*b;
*b=t;

}














