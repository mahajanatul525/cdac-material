 #include<fstream>
#include<iostream>
using namespace std;

//Following program try with one of the value 26 and get
// the difference bet'n text and binary
// Text and binary modes are not compatible with each other.
void main()
{
	ofstream out("d:\\demo1.txt",ios::binary);
	if(!out)
	{
		cout<<endl<<"can not open\n";
		return;
	}
	int num,i=0;
	while(i<5)
	{
		cin>>num;
		out.write((char*)&num,sizeof(num));
		i++;
	}
	out.close();
	ifstream in("d:\\demo1.txt");
//	ifstream in("d:\\demo1.txt",ios::binary);
	while(in.read((char*)&num,sizeof(num)))
	{
		cout<<num<<endl;
	}
}

