#include<iostream>
#include "D:\Nitin\MyCpp\client\Car.h"
using namespace std;
int main()
{
	Car mycar("Honda");
	mycar.start();
	mycar.accelerate(100);
	mycar.applyClutch();
	mycar.applyBreak();
	mycar.stop();
}