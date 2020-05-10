// lambda expression with awt

import java.awt.*;
import java.awt.event.*;

public class Demo3
{
	String text=null;
	Button b;
	public Demo3(String title)
	{
		Frame f=new Frame(title);
		f.setLayout(new FlowLayout());
		b=new Button("ok");
		f.add(b);
		/*b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				f.setBackground(Color.red);
			}
		});*/

	// using lambda expression
		b.addActionListener((ActionEvent ae)->{f.setBackground(Color.green);});

		f.setSize(400,400);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				((Frame)w.getSource()).dispose();
			}
		});
		f.setVisible(true);
	}
				
	public static void main(String args[])
	{	
		new Demo3("My Window");
	}
}