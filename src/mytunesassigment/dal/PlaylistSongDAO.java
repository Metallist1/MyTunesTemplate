/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunesassigment.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mytunesassigment.be.Playlist;
import mytunesassigment.be.Song;

/**
 *
 * @author nedas
 */
public class PlaylistSongDAO {

    SQLServerDataSource ds;

    public PlaylistSongDAO() throws IOException {
        this.ds = new SQLServerDataSource();
        DatabaseConnectionDAO connectionInfo = new DatabaseConnectionDAO();
        List<String> infoList = connectionInfo.getDatabaseInfo();
        ds.setDatabaseName(infoList.get(0));
        ds.setUser(infoList.get(1));
        ds.setPassword(infoList.get(2));
        ds.setPortNumber(Integer.parseInt(infoList.get(3)));
        ds.setServerName(infoList.get(4));
    }

    public List<Song> getPlaylistSongs(int id) {
        return null;
    }

    public void deleteFromPlaylistSongsEverything(Song songToDelete) {
    }

    public Song addToPlaylist(Playlist playlist, Song song) {
        return null;
    }

    public void deleteFromPlaylistSongsEverything(Playlist play) {
    }

    public void removeSongFromPlaylist(Playlist selectedItem, Song selectedSong) {
    }

    public void editSongPosition(Playlist selectedItem, Song selected, Song exhangeWith) {
    }

}
