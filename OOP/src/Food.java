public abstract class Food {
    String name;
    private double calories;
    private boolean haveToCook;
    private boolean vegetarian;

    public Food() {
    }

    public Food(String name, double calories, boolean haveToCook, boolean vegetarian) {
        this.name = name;
        this.calories = calories;
        this.haveToCook = haveToCook;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public boolean isHaveToCook() {
        return haveToCook;
    }

    public void setHaveToCook(boolean haveToCook) {
        this.haveToCook = haveToCook;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    abstract void eat();

    static void printInfo() {
        System.out.println("\tИнформация о еде:");
        System.out.println("Еда делится на два типа - ту которую нужно готовить, и ту которую нет. " +
                "Это будет определяться автоматически в конструкторе соответсвующего класса.");
        System.out.println("(Этот текст выведен из статического метода абстрактного класса еды)\n");
    }

    @Override
    public String toString() {
        return "Название = '" + name + "\', калориии = " + calories + ", нужно ли готовить? = " + haveToCook +
                ", вегетарианская? = " + vegetarian;
    }
}
