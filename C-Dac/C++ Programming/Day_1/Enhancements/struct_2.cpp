#include<iostream>
using namespace std;
struct Student
{
private:
	char name[20];
	int age;
};
int main()
{
	Student s1;
	// Error can access private members directly
	/*
	strcpy(s1.name,"abc");
	s1.age=16;
	cout<<s1.name<<"\t"<<s1.age<<endl;
	s1.age=-5; // risk of data corruption
	cout<<s1.name<<"\t"<<s1.age<<endl; */
}