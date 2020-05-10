import java.io.*;
public class Fifth
{
	public static void main(String args[])
	{
		try
		{
		 String dataFile = "e:\\invoicedata";

final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
final int[] units = { 12, 8, 13, 29, 50 };
final String[] descs = {
    "Java T-shirt",
    "Java Mug",
    "Duke Juggling Dolls",
    "Java Pin",
    "Java Key Chain"
};

FileOutputStream fos=new FileOutputStream(dataFile);
DataOutputStream dos=new DataOutputStream(fos);
for (int i = 0; i < prices.length; i ++) 
{
    dos.writeDouble(prices[i]);
    dos.writeInt(units[i]);
    dos.writeUTF(descs[i]);
}
dos.close();

FileInputStream fis=new FileInputStream(dataFile);
DataInputStream dis=new DataInputStream(fis);

double price;
int unit;
String desc;
double total = 0.0;

    while (dis.available()>0) {
        price = dis.readDouble();
        unit = dis.readInt();
        desc = dis.readUTF();
     System.out.println("You ordered\t"+unit+"\t"+desc+"\t"+price);
        total += unit * price;
    }
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}	
	}
}







