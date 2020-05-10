package core1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MouseClickDemo extends Application 
{  
    @Override
    public void start(Stage primaryStage) 
    {
    	System.out.println("Inside start method");
    	primaryStage.setTitle("JavaFX Skeleton");
    	// create a root node. in this case, a flow layout pane
    	// is used, but several alternatives exist.
    	FlowPane rootNode=new FlowPane(10,10);
    	
    	//rootNode.setAlignment(Pos.CENTER);
    	
     	
    	// create a scene
    	Scene scene=new Scene(rootNode,300,300);
    	MyHandler handler=new MyHandler();
    	scene.setOnMouseClicked(handler);
    
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
public MouseClickDemo() // u must have public no-arg constructor
{
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Inside no-arg constructor");
}
class MyHandler implements EventHandler<MouseEvent>
{

	@Override
	public void handle(MouseEvent event) 
	{
		// TODO Auto-generated method stub
		System.out.println("mouse clicked\t"+event.getSceneX()+"\t"+event.getSceneY());
	}
	
}
}
