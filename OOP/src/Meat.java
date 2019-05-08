public class Meat extends Food implements ICookable {
    private static final boolean haveToCook = true;
    private static final boolean vegetarian = false;
    private boolean isCooked;

    Meat(String name, double calories, boolean isCooked) {
        super(name, calories, haveToCook, vegetarian);
        this.isCooked = isCooked;
    }

    public boolean isCooked() {
        return isCooked;
    }

    public void setCooked(boolean cooked) {
        isCooked = cooked;
    }

    @Override
    public void cook() {
        setCooked(true);
        System.out.println(name + " - приготовлено.");
    }

    @Override
    void eat() {
        if (!isCooked) {
            cook();
        }
        System.out.println(name + " - съедено.");
    }

    @Override
    public String toString() {
        return super.toString() + ", приготовлено? = " + isCooked;
    }
}
