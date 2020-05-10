package core1;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonEventlDemo extends Application 
{  
	Label response;
	Button ok,cancel;
	
    @Override
    public void start(Stage primaryStage) 
    {
    	System.out.println("Inside start method");
    	primaryStage.setTitle("JavaFX Skeleton");
    	// create a root node. in this case, a flow layout pane
    	// is used, but several alternatives exist.
    	FlowPane rootNode=new FlowPane(10,10);
    	
    	rootNode.setAlignment(Pos.CENTER);
    	
    	response=new Label("Click the button");
    
    	
    	ok=new Button("Ok");
    	cancel=new Button("Cancel");
    	
    	MyHandler handler=new MyHandler();
    	ok.setOnAction(handler);
    	cancel.setOnAction(handler);
    	
    	rootNode.getChildren().addAll(ok,cancel,response);
    	// create a scene
    	Scene scene=new Scene(rootNode,300,300);
    	
    	// set the scene on the stage
    	primaryStage.setScene(scene);
    	
    	// show the stage and its scene
    	
        primaryStage.show(); 	
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
public ButtonEventlDemo() // u must have public no-arg constructor
{
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Inside no-arg constructor");
}
class MyHandler implements EventHandler
{

	@Override
	public void handle(Event event) {
		// TODO Auto-generated method stub
		Button ref=(Button)event.getSource();
		response.setText(ref.getText()+"  button is clicked");
		
	}
}

}
