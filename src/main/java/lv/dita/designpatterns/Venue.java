package lv.dita.designpatterns;

abstract class Venue {
    protected String name = "Venue";

    public String getName() {
        return name;
    }

    public abstract double cost();

}
