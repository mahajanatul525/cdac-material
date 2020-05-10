#include<stdio.h>

union book
{
char bname[25];
char authore[25];
int pageno;
};



void main()
{
unioun book b1;

b1.bname="raj";
b1.pageno=50;

printf(“\n %d %c”,b1.pageno,b1.bname);

}

