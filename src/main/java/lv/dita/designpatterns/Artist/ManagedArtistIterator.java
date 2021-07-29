package lv.dita.designpatterns.Artist;

import lv.dita.designpatterns.Artist.Artist;

import java.util.Iterator;

public class ManagedArtistIterator implements Iterator<Artist> {

    Artist[] artists;
    int position = 0;

    public ManagedArtistIterator(Artist[] artists) {
        this.artists = artists;
    }

    @Override
    public boolean hasNext() {
        return position < artists.length && artists[position] != null;
    }

    @Override
    public Artist next() {
        return artists[position++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
