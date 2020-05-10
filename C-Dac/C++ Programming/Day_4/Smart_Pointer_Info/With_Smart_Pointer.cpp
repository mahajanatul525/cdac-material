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
			cout<<"inside dest"<<endl;
			delete pName;
        }
		Person(Person &ref)
		{
			cout<<"copy const"<<endl;
			pName=new char[strlen(ref.pName)+1];
			strcpy(pName,ref.pName);
			age=ref.age;
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
class SP
{
private:
    Person*    pData; // pointer to person class
public:
    SP(Person* pValue) 
    {
		pData=new Person(*pValue);
		delete pValue;
    }
    ~SP()
    {
        // pointer no longer requried
        delete pData;
    }

    Person& operator* ()
    {
        return *pData;
    }

    Person* operator-> ()
    {    
        return pData;
    }
};

int main()
{
	SP s(new Person("abc",10));
	s->display();
	s->shout();
	(*s).display();
	(*s).shout();
	return 0;
}















