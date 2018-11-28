/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunesassigment.gui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mytunesassigment.be.Playlist;
import mytunesassigment.gui.model.PlaylistModel;

/**
 * FXML Controller class
 *
 * @author nedas
 */
public class PopupPlaylistController implements Initializable {

    @FXML
    private TextField playlistNameField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void savePlaylistname(ActionEvent event) {
    }

    @FXML
    private void goBackFromPlaylist(ActionEvent event) {
        Stage stage = (Stage) playlistNameField.getScene().getWindow();
        stage.close();
    }

}
