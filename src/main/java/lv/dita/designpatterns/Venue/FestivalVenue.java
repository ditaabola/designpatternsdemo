package lv.dita.designpatterns.Venue;

public class FestivalVenue extends Venue {

    public FestivalVenue (){
        name = "Festival venue";
    }

    public double cost() {
        return 1000;
    }

}
