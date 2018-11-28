/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunesassigment.gui.model;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import mytunesassigment.be.Song;
import mytunesassigment.bll.Manager;
import mytunesassigment.bll.LogicFacade;

/**
 *
 * @author nedas
 */
public class SongModel {

    private ObservableList<Song> allSongs = FXCollections.observableArrayList();

    private final LogicFacade logiclayer;

    public SongModel() throws IOException {
        logiclayer = (LogicFacade) new Manager();
    }

    public ObservableList<Song> getSongs() {
        allSongs = FXCollections.observableArrayList();
        allSongs.addAll(logiclayer.getAllSongs());
        return allSongs;
    }

    public void createSong(String title, String artist, String category, int playtime, String location) {
        logiclayer.createSong(title, artist, category, playtime, location);
    }

    public void deleteSong(Song songToDelete) {
        logiclayer.deleteSong(songToDelete);
    }

    public void updateSong(Song songToDelete, String title, String artist, String category, int playtime, String location) {
        logiclayer.updateSong(songToDelete, title, artist, category, playtime, location);
    }

    public ObservableList<Song> search(ObservableList<Song> items, String text) {
        return logiclayer.search(items, text);
    }
}
