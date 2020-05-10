/*
arr->pointer to first row
arr+i->pointer to ithrow
*(arr+i)->pointer to first element in ith row
*(arr+i)+j->pointer to jth element in the ith row
*(*(arr+i)+j)->value stored at(i,j)
*/
#include<stdio.h>
void main()
{int i,j;
	int arr[3][2]={1,10,2,20,3,30};
 
	printf("%u",arr); //  2002
	printf("\t%u",*arr); // 2002
	printf("\t%d",*(*arr));// 1

	for(i=0;i<6;i++)
	{ printf("\n%u\t%d",(*arr+i),*(*arr+i));
	}
        printf("\n");
          for(i=0;i<3;i++)
             {
	     for(j=0;j<2;j++)
	      {	printf("\t%d",*(*(arr+i)+j));
                printf("\t%u",*(arr+i)+j);
                  }
                       	printf("\n");
                 }

		for(j=0;j<=2;j++)
	                    printf("%d",*arr[j]);
//prints 1st coloumn data  }

return 0;
}

