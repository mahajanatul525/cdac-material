package core1;
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class BorderDemo2 extends Application 
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
    	border.setTop(new Label("Welcome to the Layout Manager World"));
    	HBox hbox = new HBox(20); 
    	hbox.setAlignment(Pos.CENTER);
    	border.setBottom(hbox);
    	hbox.getChildren().add(b1);
    	hbox.getChildren().add(b2);
    	ScrollBar sb1=new ScrollBar();
    	sb1.setOrientation(Orientation.VERTICAL);
    	ScrollBar sb2=new ScrollBar();
    	sb2.setOrientation(Orientation.VERTICAL);
    	border.setLeft(sb1);
    	border.setRight(sb2);
    	border.setCenter(new TextArea());
    	//rootNode.setAlignment(Pos.CENTER);
    	
     	
    	// create a scene
    	Scene scene=new Scene(border,300,300);
    
    	//scene.get
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
public BorderDemo2() // u must have public no-arg constructor
{
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Inside no-arg constructor");
}

}
