/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunesassigment.gui.model;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mytunesassigment.be.Playlist;
import mytunesassigment.be.Song;
import mytunesassigment.bll.Manager;
import mytunesassigment.bll.LogicFacade;

/**
 *
 * @author nedas
 */
public class PlaylistModel {

    private ObservableList<Playlist> allPlaylists;

    private LogicFacade logiclayer;

    public PlaylistModel() throws IOException {
        logiclayer = new Manager();
    }

    public ObservableList<Playlist> getPlaylists() {
        allPlaylists = FXCollections.observableArrayList();
        allPlaylists.addAll(logiclayer.getAllPlaylists());
        return allPlaylists;
    }

    public void createPlaylist(String name) {
        Playlist playList = logiclayer.createPlaylist(name);
    }

    public void deletePlaylist(Playlist play) {
        logiclayer.deletePlaylist(play);
    }

    public void editPlaylist(Playlist get, String text) {
        logiclayer.editPlaylist(get, text);
    }

    public Song addToPlaylist(Playlist get, Song get0) {
        return logiclayer.addToPlaylist(get, get0);
    }

    public void removeSongFromPlaylist(Playlist selectedItem, Song selectedSong) {
        logiclayer.removeSongFromPlaylist(selectedItem, selectedSong);
    }

    public void editSongPosition(Playlist selectedItem, Song selected, Song exhangeWith) {
        logiclayer.editSongPosition(selectedItem, selected, exhangeWith);
    }
}
