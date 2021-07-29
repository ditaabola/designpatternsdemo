package lv.dita.designpatterns;

public class BacklineDecorator extends ExtraInfoDecorator{
    Venue currentVenue;

    public BacklineDecorator(Venue venue){
        currentVenue = venue;
    }

    @Override
    public double cost() {
        return currentVenue.cost() + 20;
    }

    @Override
    public String getName() {
        return currentVenue.getName() + " with a backline available";
    }
}
