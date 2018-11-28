/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunesassigment.be;

import java.util.List;

/**
 *
 * @author nedas
 */
public class Playlist {

    private List<Song> songList;
    private int songCount;
    private int totalTime;
    private String name;
    private final int ID;

    public Playlist(int songCount, int totalTime, String name, int ID) {
        this.songCount = songCount;
        this.totalTime = totalTime;
        this.name = name;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public List<Song> getSongList() {
        return songList;
    }

    public void setSongList(List<Song> songList) {
        this.songList = songList;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Name=" + name + "Total song count =" + songCount + ", Total play Time=" + totalTime;
    }

}
