#include<iostream>
#include<string.h>
using namespace std;
class Person
{
    int age;
    char* pName;

    public:
        Person(): pName(0),age(0)
        {
        }
        Person(char* pName, int age)
        {
			this->pName=new char[strlen(pName)+1];
			strcpy(this->pName,pName);
			this->age=age;
        }
        ~Person()
        {
			delete pName;
        }

        void display()
        {
            cout<<pName<<"\t"<<age<<endl;
        }
        void shout()
        {
            cout<<"aaaaaaaaaaaoooooooooo"<<endl;
        } 
};
int main()
{
    Person* pPerson  = new Person("Scott", 25);
    pPerson->display();
    delete pPerson;
	return 0;
}











