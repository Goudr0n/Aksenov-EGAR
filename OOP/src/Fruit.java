public class Fruit extends Food {
    private static final boolean haveToCook = false;
    private static final boolean vegetarian = true;

    Fruit(String name, double calories) {
        super(name, calories, haveToCook, vegetarian);
    }

    @Override
    void eat() {
        System.out.println(name + " - съедено.");
    }
}
