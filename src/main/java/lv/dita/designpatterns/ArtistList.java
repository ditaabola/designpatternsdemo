package lv.dita.designpatterns;

import java.util.Iterator;

public interface ArtistList {
    public Iterator<Artist> createIterator();
}
