import java.lang.ProcessHandle.Info;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label; 
import javafx.scene.control.TextField; 
import javafx.scene.control.TextInputDialog;
import java.util.Optional;



	
public class SystemTestGUI extends Application 
{
    @Override    
	public void start(Stage stage)     
	{    
    	System test = new System ("Apple", "MacBook", 256);
    	
		stage.setTitle("GUI Menu");
		
		TextField pushMeTextField = new TextField();  
		pushMeTextField.prefColumnCountProperty().bind(pushMeTextField.textProperty().length());
		
		
		
		Button firstButton = new Button("Print System Details");
		firstButton.setOnAction(e -> pushMeTextField.setText(test.displayDetails()));
		
		Button secondButton = new Button ("Display System Properties");
		secondButton.setOnAction(e -> pushMeTextField.setText(test.displaySystemProperties()));
		
		Button thirdButton = new Button ("Diagnose System");
		thirdButton.setOnAction(e -> pushMeTextField.setText(test.diagnoseSystem()));
		
		Button fourthButton = new Button ("Set Details");
		fourthButton.setOnAction(e -> {
		TextInputDialog dialog = new TextInputDialog("Please input Hard Disk Information");			
		dialog.setTitle("Text Input Dialog");
		dialog.setHeaderText("Please input Hard Desk Information");
		Optional<String> input = dialog.showAndWait();
		test.setHardDisk(Integer.parseInt(input.get()));
		dialog.getEditor().clear();
		
		dialog.close();
		
		
		dialog.setHeaderText("Please input Memory Information");
		Optional<String> secondInput = dialog.showAndWait();
		test.setMemory((Integer.parseInt(secondInput.get())));
		dialog.getEditor().clear();
		dialog.close();
		
		
		dialog.setHeaderText("Please input cost Information");
		Optional<String> thirdInput = dialog.showAndWait();
		test.setPurchaseCost(((Integer.parseInt(thirdInput.get()))));
		dialog.getEditor().clear();
		dialog.close();
		
		
		
		pushMeTextField.setText(("The hard disk is set to " + input.get() + "\n" +
								 "The memory is set to " + secondInput.get() + ".\n" +
								 "The cost is " + thirdInput.get() + "."));
		
		});
		
		
		Button fifthButton = new Button ("Quit the program");
		fifthButton.setOnAction(e -> java.lang.System.exit(0));
		
		VBox vbox = new VBox();
		vbox.setSpacing(10);
		
		Label info = new Label();
		info.setText("Please click on the buttons to get information");
		
		
		vbox.getChildren().addAll(pushMeTextField,firstButton, secondButton, 
								  thirdButton, fourthButton, fifthButton , info);
		
		Scene scene = new Scene(vbox, 300, 300);
		stage.setScene(scene);

		stage.show();
	}	
		
		 public static void main(String[] args)
		 {
			 Application.launch(args);
	     }	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

