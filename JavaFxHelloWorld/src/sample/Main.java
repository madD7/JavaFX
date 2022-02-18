package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /* when we load fxml, we assign it to a variable of type Parent with name root.
         * The Parent class descends directly from the node class, which is the base class for
         * scene graph nodes. */
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        /* Since Window class is the parent of the Stage class,
        * & as Stage is the top level javafx controller, thus
        * Stage.setTitle will set the Window title.*/
        primaryStage.setTitle("Hello World JavaFx Example");

        /* Stage, scene, show are all theatrical metaphors used by JavaFx Developers.
        * Thus, each Stage requires a scene.
        * Backing each scene is a scene graph tree where each node
        * corresponds to a UI Control or an area of scene.
        * We change the setup (nodes) of the scene, and not the whole stage,
        * whenever a scene changes. */
        /* When we construct a scene, we pass the root of scene graph.
        * In practice, when we want to change the scene, we would load a new
        * fxml file and call Stage.setScene.  */
        primaryStage.setScene(new Scene(root, 400, 275));

        /* once the stage is set and we have to show the UI,
        * we call Stage.show. */
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
