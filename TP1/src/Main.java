import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Erstellen Sie ein Label mit dem Text "Hello, World!"
        Label label = new Label("Hello, Jollar!");

        // Erstellen Sie ein StackPane-Layout und fügen Sie das Label hinzu
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Erstellen Sie eine Szene mit dem Layout
        Scene scene = new Scene(root, 300, 200);

        // Setzen Sie die Szene auf das Hauptfenster und zeigen Sie es an
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX-Game");
        primaryStage.show();
    }
}
