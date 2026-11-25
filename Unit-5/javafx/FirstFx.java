import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
//need to have javafx sdk in your system and set the path to the lib folder of javafx sdk in the command line while compiling and running the program
//as we are using java 11 so we need to use javafx sdk 11 or above. You can download it from https://gluonhq.com/products/javafx/ (we used javafx 17 in this example)
//PS D:\java2026\java2026\Unit-5\javafx> javac --module-path "D:\java26\javafx\lib\" --add-modules javafx.controls,javafx.fxml FirstFx.java

public class FirstFx extends Application {
    public void start(Stage stage) throws Exception {
        stage.setTitle("First JavaFX Application");
        // StackPane root = new StackPane();
        // Button btn = new Button("Click Me");
        // root.getChildren().add(btn);
        // Scene scene = new Scene(root, 300, 200);

        Parent root = FXMLLoader.load(getClass().getResource("first.fxml"));
        Scene scene = new Scene(root, 300, 200);

        Button btn = (Button) scene.lookup(".button");
        btn.setOnAction(e -> {  
            System.out.println("Button clicked!");
        });

        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
