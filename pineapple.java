public class pineapple extends topping {
    public pineapple(pizza base) {
        super(base);
    }

    public String get_description() {
        return base.get_description() + ", Pineapple";
    }

    public double get_cost() {
        return base.get_cost() + 1.5;
    }
}
