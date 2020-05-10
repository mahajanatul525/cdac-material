class MyClient extends Thread
{
	Socket ss;
	DataOutputStream dos;
	public MyClient(Socket ss)
	{	
		this.ss=ss;
		dos=new DataOutputStream(ss.getOutputStream());
	}

	public void run()
	{
		dos.writeUTF("Welcome to out site");
	}
}
public class Server
{
	public static void main(String args[])
	{
		ServerSocket sc=new ServerSocket(20000);
		while(true)
		{
			Socket ss=sc.accept();
			new MyClient(ss).start();
		}

	}
}


