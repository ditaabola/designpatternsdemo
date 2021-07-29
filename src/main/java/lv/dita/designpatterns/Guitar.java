package lv.dita.designpatterns;

public class Guitar implements GearItem{

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

    public Guitar(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
