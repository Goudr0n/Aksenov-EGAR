public class Runner {
    public static void main(String[] args) {
        Food.printInfo();

        Meat meat = new Meat("Баранина", 800, false);
        System.out.println(meat);
        meat.eat();
        System.out.println(meat);

        System.out.println();
        Fruit apple = new Fruit("Яблоко", 120);
        System.out.println(apple);
        apple.eat();
    }
}
