package lv.dita.designpatterns.Venue;

import lv.dita.designpatterns.Venue.ExtraDecorator;
import lv.dita.designpatterns.Venue.Venue;

public class BackstageDecorator extends ExtraDecorator {

    public BackstageDecorator(Venue venue){
        this.venue = venue;
    }

    @Override
    public double cost() {
        return venue.cost() + 10;
    }

    @Override
    public String getName() {
        return venue.getName() + " with a backstage available";
    }
}
