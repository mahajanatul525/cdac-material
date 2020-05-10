#include<stdio.h>
void change(int);
void main()
{int i;
int no;
printf("enter a no to change val");

scanf("%d",&no);
printf("before call %d",no);
 
change(no);
 printf("after call %d",no);

}
void change(int x)
{
x+=5;

printf("in function %d",x);

}











#include<stdio.h>
int fact(int);
void main()
{int i;
int no,ans;
printf("enter a no to change val");

scanf("%d",&no);3
printf("before call %d",no);3
 
ans=fact(no);
 printf("after call %d",ans);

}
int fact(int x)
{
int i,f=1;
for(i=2;i<=x;i++)
f=f*i;
return f;
}


















