/*Create Course class with id,name,duration and fees. 
now accept int from user as a choice 1 , 2 , 3 or 4

Using switch case statement, perform the
following using ArrayList

(1) Add Course
(2) Delete Course
(3) Show all Course
(4) Sort all Courses in ascending order of fees.*/

package mypack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Course implements Comparable<Course>
{
	
private int id;
private String name;
private int duration;
private int fees;
 
public Course(int id,String name,int duration,int fees)
{
	this.id=id;
	this.name=name;
	this.duration=duration;
	this.fees=fees;
	
}
	
	public void disp()
	{
		System.out.println(id+ " "+ name+" "+duration+ " "+fees);
	}
	@Override
	public int compareTo(Course e)
    {
        if(fees>e.fees)
	{
		return 1;
	}
	else if(fees<e.fees)
	{
		return -1;
	}
	else
	{
		return 0;
	}
    }
}
public class Main 
{
	public static void main(String args[])
	{
		List<Course> list=new ArrayList<Course>();
		Course java=new Course(1,"java",6,40000);
		Course cpp=new Course(2,"cpp",3,10000);
		Course Csharp=new Course(3,"c#",3,20000);
		
		int n=1;
		while(n!=0)
		{
			System.out.println("Enter 0 to exit & anything to continue");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			if(n==0)
				break;
			System.out.println("Enter 1 to add \n 2 to delete \n 3 to show all \n 4 to sort");
			Scanner sc1=new Scanner(System.in);
			int choice=sc1.nextInt();
			switch(choice)
			{
			case 1:
				list.add(java);
				list.add(cpp);
				list.add(Csharp);
				System.out.println("done");
				break;
			case 2:
			
				System.out.println("press 1 to delete java 2 to delete cpp 3 to delete csharp");
				Scanner sc2=new Scanner(System.in);
				int a=sc2.nextInt();
				if(a==1)
				{
					list.remove(java);
				}
				else if(a==2)
				{
					list.remove(cpp);
				}
				else if(a==3)
				{
					list.remove(Csharp);
				}
				else
				{
					System.out.println("invalid choice");
				}
				break;
			case 3:
				Iterator i=list.iterator();
				while (i.hasNext())
				{
					((Course) i.next()).disp();
				}
				break;
			case 4:
				Collections.sort(list);
				System.out.println("sorted");
				
				break;
				
			default:
				System.out.println("enter valid choice");
				break;
			}
			
			
		}
		
	}


	
	
}
