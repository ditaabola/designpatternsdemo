package lv.dita.designpatterns;

public class BackstageDecorator extends ExtraInfoDecorator{
    Venue currentVenue;

    public BackstageDecorator(Venue venue){
        currentVenue = venue;
    }
    @Override
    public double cost() {
        return currentVenue.cost() + 10;
    }

    @Override
    public String getName() {
        return currentVenue.getName() + " with a backstage available";
    }
}
