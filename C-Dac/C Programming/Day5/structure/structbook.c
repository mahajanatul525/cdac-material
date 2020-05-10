#include<stdio.h>
void main()
{	struct book
	{
	int pgno;
	float price;
	char bname[20];
	};

struct book s1,s2;
struct book b1={350,250.50,"Kanetkar"};
struct book b2={650,500,"balguruswami"};

s1.pgno=550;
s1.price=560.50;
s1.bname="vita";

printf("%d %f %s",b1.pgno,b1.price,b1.bname);
printf("%d %f %s",b2.pgno,b2.price,b2.bname);
printf("enter pgno price and bookname");
scanf("%d %f %s",&s2.pgno,&s2.price,s2.bname);
printf("%d %f %s",s2.pgno,s2.price,s2.bname);
}