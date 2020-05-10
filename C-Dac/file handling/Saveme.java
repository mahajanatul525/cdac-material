package vardha;

import java.io.*;
class Part implements Serializable
{
	int val;
	public Part()
	{
		System.out.println("in Part constructor");
	}
	public void setVal(int val)
	{
		this.val=val;
	}
	public int getVal()
	{
		return val;
	}
}
class base implements Serializable
{
	private int var;
	public base()
	{
		System.out.println("in base constructor");
	}
	public void setVar(int var)
	{
		this.var=var;
	}
	public int getVar()
	{
		return var;
	}
}
public class Saveme extends base implements Externalizable
{
	int num;
	private Part part=new Part();
	public Saveme()
	{
		System.out.println("in Saveme const");
		
	}
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	public Part getPart()
	{
		return part;
	}
	
	  public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("in writeExternal");
        	out.writeInt(num);
    	    }

    public void readExternal(ObjectInput in) 
	    throws IOException, ClassNotFoundException
	   {
		System.out.println("in readExternal");
	        num=in.readInt();
    	   }
}