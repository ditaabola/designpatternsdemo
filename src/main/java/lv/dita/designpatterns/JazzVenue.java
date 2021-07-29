package lv.dita.designpatterns;

public class JazzVenue extends Venue{

    public JazzVenue (String name){
        name = name;
    }

    @Override
    public double cost() {
        return 50;
    }
}
