/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunesassigment.gui.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import mytunesassigment.be.Song;
import mytunesassigment.gui.model.SongModel;

/**
 * FXML Controller class
 *
 * @author nedas
 */
public class PopupSongController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField artistField;
    @FXML
    private Label timeField;
    @FXML
    private Label urlField;
    @FXML
    private ChoiceBox<String> categoryChoice;
    @FXML
    private Label specificFunctionLabel;
    @FXML
    private Label errorLabel;

    private boolean isEditing = false;
    private SongModel songModel;
    private MediaPlayer mediaPlayer;
    private Song songToEdit;
    PlaylistController controller1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void chooseURL(ActionEvent event) {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home") + System.getProperty("file.separator") + "Desktop"));
        chooser.setDialogTitle("Select song database");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "MP3 and Wav files", "mp3", ".wav");
        chooser.setFileFilter(filter);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            urlField.setText(chooser.getSelectedFile().getAbsolutePath());
            mediaPlayer = new MediaPlayer(new Media(new File(chooser.getSelectedFile().getAbsolutePath()).toURI().toString()));
        }
    }

    @FXML
    private void goBack(ActionEvent event) {
        Stage stage = (Stage) urlField.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void saveSong(ActionEvent event) {
    }



}
