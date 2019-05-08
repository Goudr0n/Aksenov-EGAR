public class DataTypesRunner {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("\tЗадание 1.");
        System.out.println((int) 'D');
        System.out.println((int) 'R');
        System.out.println((int) 'f');
    }

    private static void task2() {
        System.out.println("\n\tЗадание 2.");
        int i = 5;
        System.out.println("int " + i + " -> byte " + (byte) i);
        short s = 7;
        System.out.println("short " + s + " -> byte " + (byte) s);
        char c = 'X';
        System.out.println("char " + c + " -> int " + (int) c);
        float f = 345.768f;
        System.out.println("float " + f + " -> long " + (long) f);
        long l = 853948;
        System.out.println("long " + l + " -> int " + (int) l);
        double d = 236.65;
        System.out.println("double " + d + " -> int " + (int) d);
    }

    private static void task3() {
        System.out.println("\n\tЗадание 3.");
        int i = 5;
        System.out.println("int " + i + " -> Integer " + new Integer(i));
        boolean b = true;
        System.out.println("boolean " + b + " -> Boolean " + new Boolean(b));
        char c = 'X';
        System.out.println("char " + c + " -> Character " + new Character(c));

        Float aFloat = new Float(345.768);
        float f = aFloat;
        System.out.println("Float " + aFloat + " -> float " + f);
        Long aLong = new Long(853948);
        long l = aLong;
        System.out.println("Long " + aLong + " -> long " + l);
    }

    private static void task4() {
        System.out.println("\n\tЗадание 4.");
        String string1 = "Обычная";
        StringBuilder string2 = new StringBuilder("строка");
        System.out.println("Строки: \"" + string1 + "\", " + "\"" + string2 + "\"");
        StringBuilder reversed = new StringBuilder(string2).reverse();
        System.out.println("Реверс второй: " + reversed);
        System.out.println("Подстроки: \"" + string1.substring(0, 4) + "\", \"" + string2.substring(2) + "\"");
    }
}
