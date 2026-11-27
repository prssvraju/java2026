import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class AidsFx extends Application {
 
    public void start(Stage pimary)
    {
        Button bt = new Button("Click");
        StackPane root=new StackPane();
		root.getChildren().add(bt);
        Scene scene = new Scene(root,400,400);
        pimary.setScene(scene);
        pimary.setTitle( "First JavaFX Application");
		pimary.show();
    }
    public static void main(String args[])
    {
}
