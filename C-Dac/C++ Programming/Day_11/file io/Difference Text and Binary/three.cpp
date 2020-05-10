 #include<fstream>
#include<iostream>
using namespace std;
/*
Text Mode
void main()
{
	ofstream out("d:\\demo2.txt");
	if(!out)
	{
		cout<<endl<<"can not open\n";
		return;
	}
	float fl;
	cin>>fl;
	out<<fl;
	out.close();

	ifstream in("d:\\demo2.txt");
	float t;
	in>>t;
	cout<<t<<endl;
	// check  the size of file
}
*/

//Binary mode
void main()
{
	ofstream out("d:\\demo2.txt",ios::binary);
	if(!out)
	{
		cout<<endl<<"can not open\n";
		return;
	}
	float fl;
	cin>>fl;
	out.write((char*)&fl,sizeof(fl));
	out.close();

	ifstream in("d:\\demo2.txt",ios::binary);
	float t;
	in.read((char*)&t,sizeof(t));
	cout<<t<<endl;
	// check the size of file
}

