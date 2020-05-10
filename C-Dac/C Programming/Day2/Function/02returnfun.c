#include<stdio.h>
int sqr(int);//prototype

void main()
{
int no,square;
printf("enter a no to find a square of no");
scanf("%d",&no); //5

square=sqr(no); //calling
printf("%d",square);
printf("%d",sqr(2));

}

int sqr(int x)  //function defination
{int y;
 y=x*x;
return y;

}










#include<stdio.h>
float sum(int,float);

void main()
{int no1;
float no2,s;
printf("enter 2 no to find a square of no");
scanf("%d %f",&no1,&no2);

s=sum(no1,no2);
printf("%d",s);

}

float sqr(int x,float y)
{float c;
c=x+y;
return c;

}



#include<stdio.h>

int fact(int);

int main()
{ int no,r;
no=5;
 r=fact(no);
printf("%d",r);
return 0;
}

int fact(int n)
{ int f,i;
  f=1;
   for(i=2;i<=n;i++)
      f=f*i;
return f;

}














