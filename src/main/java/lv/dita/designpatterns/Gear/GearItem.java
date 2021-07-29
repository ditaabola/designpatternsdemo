package lv.dita.designpatterns.Gear;

import lv.dita.designpatterns.Gear.GearComponent;

public class GearItem implements GearComponent {

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

    public GearItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
