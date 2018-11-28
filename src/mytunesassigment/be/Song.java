/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytunesassigment.be;

/**
 *
 * @author nedas
 */
public class Song {

    private String title;
    private String artist;
    private String category;
    private final int playtime;
    private String location;
    private final int ID;
    private int locationInList;
    private int IDinsideList = 0;

    public Song(String title, String artist, String category, int playtime, String location, int ID) {
        this.title = title;
        this.artist = artist;
        this.category = category;
        this.playtime = playtime;
        this.location = location;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public int getIDinsideList() {
        return IDinsideList;
    }

    public void setIDinsideList(int IDinsideList) {
        this.IDinsideList = IDinsideList;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public int getLocationInList() {
        return locationInList;
    }

    public void setLocationInList(int locationInList) {
        this.locationInList = locationInList;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPlaytime() {
        return playtime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return title;
    }

}
