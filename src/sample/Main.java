package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main extends Application {
    final static Logger log = Logger.getLogger("MyLog");

    @Override
    public void start(Stage primaryStage) throws Exception{
        FileHandler fh;
        try {
            fh = new FileHandler("C:\\Users\\Admin\\IdeaProjects\\BooleanCalc\\logs.log");
            log.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
        log.info("create a file (logs.log) for writing logs");

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        log.info("create a form sample.fxml");
        root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        log.info("add style to the form style.css");
        primaryStage.setTitle("Boolean calculator");
        log.info("set title");
        primaryStage.setScene(new Scene(root));
        log.info("creating a scene");
        primaryStage.show();
        log.info("show the scene");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
