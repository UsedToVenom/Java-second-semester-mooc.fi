package buttonandlabel;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonAndLabelApplication extends Application {

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Button firstButton = new Button("press me bitch!");
        Label firstLabel = new Label("CENTER_LEFT");
        Label secondLabel = new Label("BASELINE_RIGHT");
        Label thirdLabel = new Label("TOP_CENTER");
        Label fourthLabel = new Label("BOTTOM_LEFT");

        FlowPane componentGroup = new FlowPane();

        componentGroup.getChildren().addAll(firstLabel, secondLabel, thirdLabel, fourthLabel);
        componentGroup.getChildren().add(firstButton);

        firstLabel.setAlignment(Pos.CENTER_LEFT);
        secondLabel.setAlignment(Pos.BASELINE_RIGHT);
        thirdLabel.setAlignment(Pos.TOP_CENTER);
        fourthLabel.setAlignment(Pos.BOTTOM_LEFT);

        firstButton.setOnMousePressed((MouseEvent e) -> {
            firstLabel.setText("Activated");
        });

        firstButton.setOnMouseReleased((MouseEvent e) -> {
            firstLabel.setText("neuron activated");
        });

        ListView<Labeled> list = new ListView<>();
        ObservableList<Labeled> items = FXCollections.observableArrayList(
                firstLabel, secondLabel, thirdLabel, fourthLabel, firstButton);
        list.setItems(items);
        

        Scene view = new Scene(list);

        window.setScene(view);
        window.show();

    }

}
