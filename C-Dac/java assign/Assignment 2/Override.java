/*create a class "Vehicle", define a method "public void start()" in it. From this class derive a class FourWheeler. How will u override "start()" method of parent class ?*/

class Vehicle
{
	public void start()
	{
	 System.out.println("In vehicle");
	}
}

class Fourwheeler extends Vehicle
{
	public void start()
	{
	 super.start();
	 System.out.println("In Fourwheeler");
	}
}


public class Override
{

     public static void main(String args[])
	{
		/*Vehicle v=new Fourwheeler();
		v.start();
		Fourwheeler f=(Fourwheeler) v;
		f.start();
		//Fourwheeler f1= new Vehicle();//error
		//Fourwheeler f1= (Vehicle) v; error
		//Fourwheeler f1= v;//error
		f1.start();*/
		Fourwheeler f1=new Fourwheeler();
		f1.start();
	}
}