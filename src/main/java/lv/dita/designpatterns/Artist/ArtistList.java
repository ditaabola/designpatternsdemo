package lv.dita.designpatterns.Artist;

import lv.dita.designpatterns.Artist.Artist;

import java.util.Iterator;

public interface ArtistList {
    public Iterator<Artist> createIterator();
}
