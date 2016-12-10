package main.java.fxapp;

import main.java.controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.model.FilePacker;
import main.java.model.FileProcessor;

import java.io.IOException;

/**
 * The main class that runs the application
 */
public class FXApp extends Application {

    private Stage myStage;
    private FileProcessor fp;
    private FilePacker packer;

    @Override
    public void start(Stage stage) {
        myStage = stage;
        fp = new FileProcessor();
        packer = new FilePacker();
        setScreen("MainScreen");
        myStage.setTitle("Knowledge Quiz Converter");
        myStage.show();
    }

    private void setScreen(String screen) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(FXApp.class.getResource("/main/java/view/" + screen + ".fxml"));
            myStage.setScene(new Scene(loader.load()));
            Controller controller = loader.getController();
            controller.setMainApp(this);
        } catch (IOException e) {
            System.out.println("Error finding file: " + screen + ".fxml");
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public FileProcessor getProcessor() { return fp; }

    public FilePacker getPacker() { return packer; }

    public Stage getStage() { return myStage; }

}
