/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunesassigment.bll;

import java.util.List;
import javafx.collections.ObservableList;
import mytunesassigment.be.Playlist;
import mytunesassigment.be.Song;

/**
 *
 * @author nedas
 */

public interface LogicFacade {

    public List<Playlist> getAllPlaylists();

    public void deletePlaylist(Playlist play);

    public List<Song> getAllSongs();

    public Song createSong(String title, String artist, String category, int playtime, String location);

    public void deleteSong(Song songToDelete);

    public Playlist createPlaylist(String name);

    public Song addToPlaylist(Playlist playlist, Song song);

    public void removeSongFromPlaylist(Playlist selectedItem, Song selectedSong);

    public void editPlaylist(Playlist get, String text);

    public Song updateSong(Song songToDelete, String title, String artist, String category, int playtime, String location);

    public void editSongPosition(Playlist selectedItem, Song selected, Song exhangeWith);

    public ObservableList<Song> search(ObservableList<Song> items, String text);

}
