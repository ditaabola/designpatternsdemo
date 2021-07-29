package lv.dita.designpatterns;

abstract class ExtraInfoDecorator extends Venue{

    @Override
    public abstract double cost();

    @Override
    public abstract String getName();
}
