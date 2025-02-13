package borderpane;


import java.awt.TextComponent;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApplication extends Application {

    public static void main(String[] args) {
        launch(BorderPaneApplication.class);
    }

    @Override
    public void start(Stage window){
        
        BorderPane view = new BorderPane();
        
        Label north = new Label();
        north.setText("NORTH");
        
        Label east = new Label();
        east.setText("EAST");
        
        Label south = new Label();
        south.setText("SOUTH");
        
        view.setTop(north);
        view.setRight(east);
        view.setBottom(south);
        
        
        
        Scene scene = new Scene(view);
        
        window.setScene(scene);
        window.show();
        
        
        
    }

}
