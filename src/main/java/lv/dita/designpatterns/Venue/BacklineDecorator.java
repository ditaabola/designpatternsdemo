package lv.dita.designpatterns.Venue;

import lv.dita.designpatterns.Venue.ExtraDecorator;

public class BacklineDecorator extends ExtraDecorator {

    public BacklineDecorator(Venue venue){
        this.venue = venue;
    }

    @Override
    public double cost() {
        return venue.cost() + 20;
    }

    @Override
    public String getName() {
        return venue.getName() + " with a backline available";
    }
}
