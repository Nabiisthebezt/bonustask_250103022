public class cheese extends topping {
    public cheese(pizza base) {
        super(base);
    }

    public String get_description() {
        return base.get_description() + ", Cheese";
    }

    public double get_cost() {
        return base.get_cost() + 2.0;
    }
}
