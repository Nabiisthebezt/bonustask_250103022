public class pizzabuilder {
    public static void main(String[] args) {
        pizza[] stages = new pizza[4];
        stages[0] = new plainpizza();
        stages[1] = new cheese(stages[0]);
        stages[2] = new olives(stages[1]);
        stages[3] = new pineapple(stages[2]);

        for (int i = 0; i < stages.length; i++) {
            System.out.println("Step " + i + ": " + stages[i].get_description());
            System.out.println("Cost " + i + ": $" + stages[i].get_cost());
        }

        pizza tmp = stages[stages.length - 1];
        System.out.println("Final description: " + tmp.get_description());
        System.out.println("Total cost: $" + tmp.get_cost());
    }
}
