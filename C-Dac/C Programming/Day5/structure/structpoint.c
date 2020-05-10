#include<stdio.h>
struct book
{
char bname[25];
char authore[25];
int pgno;
};
void display(struct book *);
void main()
{
struct book b1={"let us c","kanitkar", 501};
display(&b1);
}
void display(struct book *b)
{
printf("\n %s %s %d",b->bname,b->authore,b->pgno);
b->bname="vita";
printf("\n %s %s %d",(*b).bname, (*b).authore, (*b).pgno);

}


