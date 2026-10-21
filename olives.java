public class olives extends topping {
    public olives(pizza base) {
        super(base);
    }

    public String get_description() {
        return base.get_description() + ", Olives";
    }

    public double get_cost() {
        return base.get_cost() + 1.0;
    }
}
