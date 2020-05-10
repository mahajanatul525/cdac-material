#include<stdio.h>

void main() 
{int i,j;

char *arr[]={"raj","mona","geeta"};


printf("%u",arr);
printf("\t%u",&arr[0]);
printf("\n%s",arr[0]);
printf("\t%u",*arr);
printf("\t%s",*arr);


printf("\n%s",arr[1]);
printf("\t%s",*(arr+1));
printf("\t%u",arr+1);

printf("\n%s",arr[2]);
printf("\t%s",*(arr+2));
printf("\t%u",arr+2);
getche();

}