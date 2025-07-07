package textstatistics;

import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);

    }

    @Override
    public void start(Stage stage) {
        
        BorderPane pane = new BorderPane();
        //VBox pane = new VBox();

        TextArea field = new TextArea();
        Label letters = new Label();
        letters.setText("Letters: 0");
        Label words = new Label();
        words.setText("Words: 0");
        Label longest = new Label();
        longest.setText("The longest word is:           ");

        HBox box2 = new HBox();
        box2.setSpacing(10);
        box2.getChildren().addAll(letters, words, longest);

        field.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> change,
                    String oldValue, String newValue) {
                words.setText("Words: " + countWords(oldValue, newValue));
                letters.setText("Letters: " + countLetters(oldValue, newValue));
                longest.setText("The longest word is: " + findLongest(oldValue, newValue));

            }
        });

        pane.setCenter(field);
        pane.setBottom(box2);
                
                //getChildren().addAll(field, box2);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private String countWords(
            String oldValue, String newValue) {

        int wordCount = 0;

        List<String> list = Arrays.asList(newValue.split("[ \n]+"));
        wordCount = list.size();
        if (list.size() > 0) {
            if (list.get(0).equals("")) {
                wordCount--;
            }
        }
        System.out.println(oldValue + " -> " + newValue);
        return String.valueOf(wordCount);
    }

    private String countLetters(String oldValue, String newValue) {
        return String.valueOf(newValue.length());
        
    }

    private String findLongest(String oldValue, String newValue) {
        String[] list = newValue.split("[ \n]+");
        String longest = "";
        for(String element:list){
            if (element.length()>longest.length()){
                longest = element;
                 
            }
        }
        
        return longest;
    }

}
