#include<stdio.h>
int sum(int m)
{int r;
static s=0;

if(m==0)
return 0;

else

{r=m%10;
s=s+r;
sum(m/10);
return s;
 }

}
void main()
{
int m,res;
printf("Enter the value of m");
scanf("%d",&m);

res = sum(m);
printf("sum=%d",res);
}