package lv.dita.designpatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArtistRoster implements Iterable<Artist> {
        protected List<Artist> artists;

    public ArtistRoster() {
        super();
        artists = new ArrayList<Artist>();
    }

    public boolean addArtist(String name, String contactEmail, int numberOfMembers, int fee) {
        Artist artist = new Artist(name, contactEmail, numberOfMembers, fee);
        return artists.add(artist);
    }

    public boolean addArtist(Artist artist) {
        return artists.add(artist);
    }

    public List<Artist> getArtists() {
        return artists;
    }

    @Override
    public Iterator<Artist> iterator() {
        return artists.iterator();
    }
}
