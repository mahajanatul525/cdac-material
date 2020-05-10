
 
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
 
public class HelloWorld extends Application 
{  
	Button b1,b2;
    @Override
    public void start(Stage primaryStage) 
    {
    	System.out.println("Inside start method");
        b1=new Button("ok");
        b2=new Button("cancel");
       
        MyEventHandler mh=new MyEventHandler();
        b1.setOnAction(mh);
        b2.setOnAction(mh);
       
        FlowPane root = new FlowPane();
        ObservableList<Node> list=root.getChildren();
        list.add(b1);
        list.add(b2);
        Scene scene = new Scene(root, 300, 250);    
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();   
    }
    class MyEventHandler implements EventHandler<ActionEvent>
    {

		@Override
		public void handle(ActionEvent arg) 
		{
			String text=((Button)arg.getSource()).getText();
			System.out.println(text);
			
		}
    	
    }
 @Override
	public void init() throws Exception 
 	{
		// TODO Auto-generated method stub
		
		System.out.println("inside init method");
	}
	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("inside stop method");
	}
public static void main(String[] args) 
{	
	System.out.println("Before calling launch");
        launch();
    System.out.println("After calling launch");
    }
public HelloWorld() // u must have public no-arg constructor
{
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Inside no-arg constructor");
}

}