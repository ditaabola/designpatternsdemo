package lv.dita.designpatterns;

public class Keyboard implements GearItem{

    private String name;

    @Override
    public String printGearItems() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Keyboard(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return this.getName();
    }

}
