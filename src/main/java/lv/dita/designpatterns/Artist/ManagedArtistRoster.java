package lv.dita.designpatterns.Artist;

import lv.dita.designpatterns.Artist.Artist;
import lv.dita.designpatterns.Artist.ArtistList;
import lv.dita.designpatterns.Artist.ManagedArtistIterator;

import java.util.Iterator;

public class ManagedArtistRoster implements ArtistList {

    static final int MAX_ARTISTS = 5;
    int numberOfArtists = 0;
    private Artist[] artists;

    public ManagedArtistRoster() {
        super();
        artists = new Artist[MAX_ARTISTS];
    }


    public boolean addArtist(Artist artist) {
        if (numberOfArtists < (MAX_ARTISTS)) {
            artists[numberOfArtists++] = artist;
            return true;
        } else {
            System.out.println("Manager has a full roster and cannot accept artist: " + artist.getName());
            return false;
        }
    }

    public Artist[] getArtists() {
        return artists;
    }

    @Override
    public Iterator createIterator() {
        return new ManagedArtistIterator(artists);
    }
}
