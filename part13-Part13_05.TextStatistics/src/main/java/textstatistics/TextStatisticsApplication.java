package textstatistics;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window){
        BorderPane border = new BorderPane();
        border.setCenter(new TextArea());
        HBox bottomBox = new HBox();
        bottomBox.getChildren().addAll(new Label("Letters: 0"), new Label("Words: 0"), new Label("The longest word is:"));
        border.setBottom(bottomBox);
        Scene scene = new Scene(border);
        window.setScene(scene);
        window.show();
        
        
    }

}
