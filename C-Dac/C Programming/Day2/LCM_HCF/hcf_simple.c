#include<stdio.h>
void main()
{int m,n,temp,reminder;
m=4,n=6;
	if(m<n)
	{
	temp=m;
	m=n;
	n=temp;      }
while(1)
{
	reminder=m%n;
	if(reminder==0)
	 {  printf("hcf=%d",n);
	    break;}
      else
	{m=n;
 	n=reminder;}

}

lcm=m*n/n;
printf("lcm=%d",lcm);
}






#include<stdio.h>
void main()
{ int i,n1,n2,t,x;
n1=4;
n2=6;
 if(n1<n2) 
 {  t=n1;
   n1=n2;
  n2=t;
 }
if(n1%n2==0)
 printf("lcm=%d",n1)

else
  {for(i=2; ;i++)
    {   x=n1*i;
     if(x%n2==0)
      break;
      }
   printf("lcm=%d",x);
 }
  






}

























