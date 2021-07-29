package lv.dita.designpatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GigArtistList implements ArtistList{
       List<Artist> artists;

    public GigArtistList() {
        artists = new ArrayList<Artist>();
    }

    public void addArtist(String name, String contactEmail, int numberOfMembers, int fee) {
        Artist artist = new Artist(name, contactEmail, numberOfMembers, fee);
        artists.add(artist);
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public Iterator<Artist> createIterator() {
        return artists.iterator();
    }
}
