import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.IOException;
public class screen extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("titlePage.fxml"));
            Scene scene = new Scene(root, 1280, 720, Color.CORAL);

            Image icon = new Image("gozarutchi.jpg");
            stage.getIcons().add(icon);
            stage.setTitle("Tomagotchi Pet Farm");
            stage.setResizable(false);

            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
