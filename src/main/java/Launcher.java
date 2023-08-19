import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Launcher extends Application {
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(new FXMLLoader(this.getClass().getResource("/view/textEditorForm.fxml")).load()));
        primaryStage.setTitle("Untitled Document");
        //Image image = new Image("/images/note.png");
        //primaryStage.getIcons().add(image);


        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
