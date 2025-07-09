package title;

import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application{

    @Override
    public void start(Stage window){
        Parameters param = getParameters();
        String title = param.getNamed().get("Title");
        window.setTitle(title);
        window.show();
    }


}
