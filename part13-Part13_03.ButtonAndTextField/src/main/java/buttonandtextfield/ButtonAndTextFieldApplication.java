package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.Region;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage window){
        Button button = new Button();
        TextField field = new TextField();
        
        button.setText("Button");
        field.setText("Text Field");
        
        ListView<Region> view = new ListView<>();
        view.getItems().addAll(button, field);
        
        Scene scene = new Scene(view);
        
        
        window.setScene(scene);
        window.show();
    
    }

}
