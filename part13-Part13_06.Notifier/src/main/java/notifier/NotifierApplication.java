package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window){
        VBox box = new VBox();
        
        TextField field = new TextField();
        Button button = new Button();
        Label label = new Label();
        
        box.getChildren().addAll(field, button, label);
        
        button.setOnMouseClicked(event -> label.setText(field.getText()));
        
        button.setText("Copty Button");
        
        Scene scene = new Scene(box);
        window.setScene(scene);
        window.show();
        
    
    }

}
