/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunesassigment.gui.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import mytunesassigment.be.Playlist;
import mytunesassigment.be.Song;
import mytunesassigment.gui.model.PlaylistModel;
import mytunesassigment.gui.model.SongModel;

/**
 * FXML Controller class
 *
 * @author nedas
 */
public class PlaylistController implements Initializable {

    private final PlaylistModel playlistModel;
    private final SongModel songModel;
    private ObservableList<Playlist> observableListPlay;
    private ObservableList<Song> observableListSong;
    @FXML
    private Label currentSong;
    @FXML
    private TableView<Song> songsInPlaylist;
    @FXML
    private TableView<Song> tableViewSongs;
    @FXML
    private TableColumn<Song, String> nameColumn;
    @FXML
    private TableColumn<Song, String> artistColumn;
    @FXML
    private TableColumn<Song, String> categoryColumn;
    @FXML
    private TableColumn<Song, Integer> timeColumn;
    @FXML
    private TableView<Playlist> playlistTableView;
    @FXML
    private TableColumn<Playlist, String> playlistSongNames;
    @FXML
    private TableColumn<Playlist, Integer> playlistSongTotalCount;
    @FXML
    private TableColumn<Playlist, Integer> playlistSongTotalTime;
    @FXML
    private TableColumn<Song, Integer> songInPlaylistID;
    @FXML
    private TableColumn<Song, String> songsInPlaylistName;
    @FXML
    private TextField searchTextBox;
    @FXML
    private Slider volumeSlider;
    @FXML
    private Button playlistCreateButton;
    @FXML
    private Button playlistEditButton;
    @FXML
    private Button playlistDeleteButton;
    @FXML
    private Button songCreateButton;
    @FXML
    private Button songEditButton;
    @FXML
    private Button songDeleteButton;
    @FXML
    private Button playButton;

    public PlaylistController() throws IOException {
        playlistModel = new PlaylistModel();
        songModel = new SongModel();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        observableListPlay = playlistModel.getPlaylists();
        observableListSong = songModel.getSongs();
    }

    @FXML
    private void SkipSongBackward(ActionEvent event) {
    }

    @FXML
    private void playSong(ActionEvent event) {
    }

    @FXML
    private void skipSongForward(ActionEvent event) {
    }

    @FXML
    private void setSound(MouseEvent event) {
    }


    private void play() {
    }

    @FXML
    private void createPlaylist(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/mytunesassigment/gui/view/popupPlaylist.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1, 800, 800));
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void editPlaylist(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/mytunesassigment/gui/view/popupPlaylist.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1, 800, 800));
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void deletePlaylist(ActionEvent event) {
    }

    @FXML
    private void moveSongUp(ActionEvent event) {
    }

    @FXML
    private void moveSongDown(ActionEvent event) {
    }

    @FXML
    private void removeSong(ActionEvent event) {
    }

    @FXML
    private void addSong(ActionEvent event) {
    }

    @FXML
    private void createSong(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/mytunesassigment/gui/view/popupSong.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1, 800, 800));
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void editSong(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/mytunesassigment/gui/view/popupSong.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1, 800, 800));
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void deleteSong(ActionEvent event) {
    }

    @FXML
    private void displaySongsInPlaylist(MouseEvent event) {
    }

    @FXML
    private void search(KeyEvent event) {
    }
}
