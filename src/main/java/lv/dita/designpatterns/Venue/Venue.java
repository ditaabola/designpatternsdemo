package lv.dita.designpatterns.Venue;

public abstract class Venue {
    protected String name = "Venue";

    public String getName() {
        return name;
    }

    public abstract double cost();
}
