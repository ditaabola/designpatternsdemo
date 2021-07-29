package lv.dita.designpatterns;

import java.util.Arrays;
import java.util.Iterator;

public class Manager implements Iterable<Artist> {

    protected static int MAX_ARTISTS = 10;
    protected int totalArttists = 0;
    protected Artist[] artists;

    public Manager() {
        super();
        artists = new Artist[MAX_ARTISTS];
    }

    public boolean addArtist(String name, String contactEmail, int numberOfMembers, int fee) {
        Artist artist = new Artist(name, contactEmail, numberOfMembers, fee);
        if (totalArttists < (MAX_ARTISTS - 1)) {
            artists[totalArttists++] = artist;
            return true;
        } else {
            System.out.println("Manager has a full roster and cannot accept more artists!");
            return false;
        }
    }

    public boolean addArtist(Artist artist) {
        if (totalArttists < (MAX_ARTISTS - 1)) {
            artists[totalArttists++] = artist;
            return true;
        } else {
            System.out.println("Manager has a full roster and cannot accept more artists!");
            return false;
        }
    }

    public Artist[] getArtists() {
        return artists;
    }

    @Override
    public Iterator<Artist> iterator() {
        return Arrays.stream(artists).iterator();
    }

}
