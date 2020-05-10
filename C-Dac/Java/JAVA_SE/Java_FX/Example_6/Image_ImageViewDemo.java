
/* Image encapsulates the image itself and the ImageView manages
the display of an image. Both classes are packaged in javafx.scene.image.
*/

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Image_ImageViewDemo extends Application 
{  
    @Override
    public void start(Stage primaryStage) 
    {
    	System.out.println("Inside start method");
    	primaryStage.setTitle("JavaFX Skeleton");
    	// create a root node. in this case, a flow layout pane
    	// is used, but several alternatives exist.
    	FlowPane rootNode=new FlowPane(10,10);
    	
    	rootNode.setAlignment(Pos.CENTER);

    	File f=new File("d:\\background.gif");
    	Image image=new Image(f.toURI().toString());
    	
    	ImageView view=new ImageView(image);
    	
    	rootNode.getChildren().add(view);
    	
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
public Image_ImageViewDemo() // u must have public no-arg constructor
{
	super();
	// TODO Auto-generated constructor stub
	System.out.println("Inside no-arg constructor");
}
}
