package core1;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BorderDemo1 extends Application 
{  
    @Override
    public void start(Stage primaryStage) 
    {
    	System.out.println("Inside start method");
    	primaryStage.setTitle("JavaFX Skeleton");
    	// create a root node. in this case, a flow layout pane
    	// is used, but several alternatives exist.
    	Button b1=new Button("ok");
    	Button b2=new Button("cancel");
    	BorderPane border = new BorderPane();
    	HBox hbox = new HBox(20);
    	border.setTop(hbox);
    	hbox.getChildren().add(b1);
    	hbox.getChildren().add(b2);
    	
    	
    	     	
    	// create a scene
    	Scene scene=new Scene(border,300,300);
    
    
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
public BorderDemo1() // u must have public no-arg constructor
{
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Inside no-arg constructor");
}

}
