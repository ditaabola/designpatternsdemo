package lv.dita.designpatterns.Gear;

import java.util.ArrayList;
import java.util.List;

public class CompositeGear implements GearComponent {

        private String name;
        private List<GearComponent> childItems;

        public CompositeGear(String name) {
            this.name = name;
            this.childItems = new ArrayList<>();
        }

        public String printGearItems() {

//            StringBuilder builder = new StringBuilder();
//            builder.append(print(this));
//            Iterator<GearItem> itr = gearItems.iterator();
//            while(itr.hasNext()){
//                GearItem gearItem = itr.next();
//                builder.append(gearItem.toString());
//            }

            String gearForABand = this.name;
            for (GearComponent item: childItems) {
                gearForABand += item.printGearItems();
                gearForABand += " |";
            }
            return gearForABand;
        }

        public void addGear(GearComponent gearItem) {
            childItems.add(gearItem);
        }

        public void removeGear(GearComponent gearItem) {
            childItems.remove(gearItem);
        }

    @Override
    public String toString() {
        return name;
    }
}
