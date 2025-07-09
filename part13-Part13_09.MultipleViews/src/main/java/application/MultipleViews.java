package application;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    public static void main(String[] args) {
        Application.launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) {
        BorderPane firstView = new BorderPane();
        VBox secondView = new VBox();
        GridPane thirdView = new GridPane();
        
        Scene first = new Scene(firstView);
        Scene second = new Scene(secondView);
        Scene third = new Scene(thirdView);
        
        
        Button firstButton = new Button("To the second view!");
        Label firstLabel = new Label("First view!");
        firstView.setTop(firstLabel);
        firstView.setCenter(firstButton);
        
        window.setScene(first);
        window.show();
        
        firstButton.setOnMouseClicked((event) -> {
            window.setScene(second);
        });
        
        Label secondLabel = new Label("Second view!");
        Button secondButton = new Button("To the third view!");
        secondView.getChildren().addAll(secondButton, secondLabel);
        
        secondButton.setOnMouseClicked((event) -> {
            window.setScene(third);
        });
        
        Label thirdLabel = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        thirdView.add(thirdLabel, 0, 0);
        thirdView.add(thirdButton, 1, 1);
        
        thirdButton.setOnMouseClicked((event) -> {
            window.setScene(first);
        });
                
        
        
        
    }

}
