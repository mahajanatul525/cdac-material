void main()
{	 int n;
	 void fib(int);
printf("Enter the number of terms in fibonacci series :");
	 scanf("%d",&n);
	 if(n==0)
		printf("\nInvalid choice");
	 else if(n==1)
		printf("\n0");
	 else if(n==2)
		printf("\n 0 \t 1");
	 else
	  {  printf("\n0 \t1");
	   fib(n);
        }
}
void fib(int n)
{	  static int x=0,y=1;
     int c;
	  c=x+y;
	  printf("\t%d",c);1
	  x=y;
	  y=c;
	  n--;
	  if(n>2)
		 fib(n);  //Recursive call 
 }











void main()
{	 int n,i,a,b;
a=0,b=1,c;
printf("Enter the number of terms in fibonacci series :");
	 scanf("%d",&n);
	 if(n==0)
		printf("\nInvalid choice");
	 else if(n==1)
		printf("\n0");
	 else if(n==2)
		printf("\n 0 \t 1");
	 else
	  {  printf("\n0 \t1");


       for(i=1;i<=n-2;i++)
           { c=a+b;
           
          printf("%d",c);1 2 3
            a=b;
             b=c; 

           }
    }
}























