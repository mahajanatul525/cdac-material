// member functions are an interface bet'n data and  program .

#include<iostream>
using namespace std;
struct Student
{
private:
	char name[20];
	int age;
public:
	void setName(char *ptr) // member functions
	{
		strcpy(name,ptr);
	}
	char* getName()
	{
		return name;
	}
	void setAge(int k)
	{
		age=k;
	}
	int getAge()
	{
		return age;
	}
};
int main()
{
	Student s1;
	// indirect access to data
	s1.setName("abc");
	s1.setAge(16);
	cout<<s1.getName()<<"\t"<<s1.getAge()<<endl;
	// s1.age=-5;  No risk of data corruption
}












