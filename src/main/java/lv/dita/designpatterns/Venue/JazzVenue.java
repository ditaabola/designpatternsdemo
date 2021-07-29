package lv.dita.designpatterns.Venue;

public class JazzVenue extends Venue {

    public JazzVenue (){
        name = "Jazz Venue";
    }

    @Override
    public double cost() {
        return 50;
    }

}
