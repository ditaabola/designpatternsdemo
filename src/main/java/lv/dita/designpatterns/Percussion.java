package lv.dita.designpatterns;

public class Percussion implements GearItem{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Percussion(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String printGearItems() {
        return this.name;
    }
}
