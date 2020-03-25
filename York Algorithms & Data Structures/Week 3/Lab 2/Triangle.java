import javafx.application.Application;
import javafx.stage.Stage; 
import javafx.scene.Group; 
import javafx.scene.shape.Line;
import javafx.scene.Node;
import javafx.scene.paint.Color; 
import javafx.scene.Scene;


public class Triangle extends Application{
	
	@Override
	public void start(Stage stage)
	{
		Line lineA = new Line();
		Line lineB = new Line();
		Line lineC = new Line();
		
		lineA.setStartX(0.0f);
		lineA.setStartY(0.0f);
		lineA.setEndX(100.0f);
		lineA.setEndY(70.0f);
		
		lineA.setStartX(0.0f);
		lineA.setStartY(0.0f);
		lineA.setEndX(100.0f);
		lineA.setEndY(70.0f);
		
		lineB.setStartX(0.0f);
		lineB.setStartY(0.0f);
		lineB.setEndX(100.0f);
		lineB.setEndY(250.0f);
		
		lineC.setStartX(100.0f);
		lineC.setStartY(70.0f);
		lineC.setEndX(100.0f);
		lineC.setEndY(250.0f);
		
		lineA.setStroke(Color.BLACK);
		lineB.setStroke(Color.BLACK);
		lineC.setStroke(Color.BLACK);
		
		Group root = new Group(lineA, lineB, lineC); 
		 
		Scene scene = new Scene(root, 250, 275, Color.YELLOW); 
		
		stage.setScene(scene);       
		stage.setTitle("Triangle"); // show the stage         
		stage.show(); 
		
	}
	
	 public static void main(String[] args)    
	 {         
		 launch(args);     
	 }
	
}
