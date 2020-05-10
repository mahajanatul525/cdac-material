void ap(int n, int *p,*q)
{ int pi=3.14;

*p=pi*n*n;
*q=2*pi*n;


}



int main()
{ float no,a,p;


no=5;

sc(no,&a,&p);


pf("%f %f",a,p);

}






void sc(int n, int *p,*q)
{

*p=n*n;
*q=n*n*n


}



int main()
{ int no,s,c;


no=5;
sc(no,&s,&c);


pf("%d %d",s,c);





}




















#include<stdio.h>
float area(int);
float peri(int);
float pi=3.14;
void main()
{
 int r;
float a,p;
r=2;
a=area(r);
p=peri(r);
printf("%f %f",a,p);
}

float area(int x)
{float a;

a=pi*x*x;
return a;

}

float peri(int x)
{float a;

a=pi*2*x;
return a;

}