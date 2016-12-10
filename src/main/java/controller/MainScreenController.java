package main.java.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;

/**
 * Controls the UI of MainScreen.fxml
 * @author Alexander
 * @version 1.0.0
 */
public class MainScreenController extends Controller {

    @FXML
    private Button loadButton;
    @FXML
    private Label loadLabel;
    @FXML
    private Button convertButton;
    @FXML
    private Label convertLabel;
    @FXML
    private Button packButton;
    @FXML
    private Label instructionsLabel;
    @FXML
    private Label authorLabel;

    private File oldFile;
    private File newFile;

    @FXML
    private void initialize() {
        loadLabel.setText("Loaded file:\n");
        convertLabel.setText("Converted file saved as:\n");
        authorLabel.setText("Created by Alexander Hennie-Roed");
        instructionsLabel.setText("To use, select the text file that contains the " +
                "quiz questions. Check that the loaded file has the correct name, then " +
                "click the convert button and choose where and under what name you want " +
                "to save the new XML file. Then click the pack button, move the two files " +
                "into a folder with no other files, and click the okay button. Finally, select " +
                "the folder where you just moved those files.");
        convertButton.setDisable(true);
        packButton.setDisable(true);
    }

    @FXML
    private void loadFile() {
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Choose the file to convert");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Text Files", "*.txt"));
            File selectedFile = fileChooser.showOpenDialog(mainApp.getStage());
            if (selectedFile != null) {
                oldFile = selectedFile;
            }
            loadLabel.setText(loadLabel.getText() + " " + oldFile.getName());
            convertButton.setDisable(false);
        } catch (Exception e) {
            //Debugging print
            System.out.println("***DEBUGGING***");
            System.out.println(e.getMessage());
            e.printStackTrace();
            //Debugging print
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "There was an error while loading the file.\n"
                + "Please try again.");
            alert.showAndWait()
                    .filter(response -> response == ButtonType.OK);
        }
    }

    @FXML
    private void convertFile() {
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Choose where to save the file");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("XML Files", "*.xml"));
            File selectedFile = fileChooser.showSaveDialog(mainApp.getStage());
            if (selectedFile != null) {
                newFile = selectedFile;
            }
            if (mainApp.getProcessor().convertFile(oldFile, newFile)) {
                convertLabel.setText(convertLabel.getText() + " " + newFile.getName());
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "File was successfully converted.");
                alert.showAndWait()
                        .filter(response -> response == ButtonType.OK);

                loadButton.setDisable(true);
                convertButton.setDisable(true);
                packButton.setDisable(false);
            } else {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                        "Could not properly convert or save the file.\nPlease try again.");
                alert.showAndWait()
                        .filter(response -> response == ButtonType.OK);
                loadLabel.setText("Loaded file:\n");
            }
        } catch (Exception e) {
            //Debugging print
            System.out.println("***DEBUGGING***");
            System.out.println(e.getMessage());
            e.printStackTrace();
            //Debuggin print
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "There was an error while converting the file.\n"
                    + "Please try again.");
            alert.showAndWait()
                    .filter(response -> response == ButtonType.OK);
        }
    }

    @FXML
    private void packFiles() {
        try {
            File srcDir = null;
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                    "Please put " + newFile.getName() + " and imsmanifest.xml "
                            + "into a folder with no other files, then click okay.");
            alert.showAndWait()
                    .filter(response -> response == ButtonType.OK);
            DirectoryChooser fileChooser = new DirectoryChooser();
            fileChooser.setTitle("Choose the directory with the two files");
            File selectedFile = fileChooser.showDialog(mainApp.getStage());
            if (selectedFile != null) {
                srcDir = selectedFile;
            }
            if (mainApp.getPacker().packToZip(srcDir)) {
                Alert alertt = new Alert(Alert.AlertType.CONFIRMATION, "Files were successfully packed.\n"
                        + "You can now close the program.");
                alertt.showAndWait()
                        .filter(response -> response == ButtonType.OK);
                packButton.setDisable(true);
            } else {
                Alert alertt = new Alert(Alert.AlertType.CONFIRMATION,
                        "Could not properly pack the files.\nPlease try again.\n" +
                                "If the error was access denied, please move the folder " +
                                "to a different location and try again.");
                alertt.showAndWait()
                        .filter(response -> response == ButtonType.OK);
                loadLabel.setText("Loaded file:\n");
            }
        }  catch (Exception e) {
            //Debugging print
            System.out.println("***DEBUGGING***");
            System.out.println(e.getMessage());
            e.printStackTrace();
            //Debugging print
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "There was an unknown error while packing the file.\n"
                    + "Please try again.");
            alert.showAndWait()
                    .filter(response -> response == ButtonType.OK);
        }
    }

}
