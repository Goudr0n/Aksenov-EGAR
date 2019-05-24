package beans;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void run() {
        try {
            generateArithmeticException();
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException catch");
        }

        try {
            generateArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException catch");
        }

        try {
            generateClassNotFoundException();
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException catch");
        }

        try {
            generateFileNotFoundException();
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException catch");
        }

        try {
            generateIOException();
        } catch (IOException e) {
            System.err.println("IOException catch");
        }

        try {
            generateNoSuchFieldException();
        } catch (NoSuchFieldException e) {
            System.err.println("NoSuchFieldException catch");
        }

        try {
            generateNoSuchMethodException();
        } catch (NoSuchMethodException e) {
            System.err.println("NoSuchMethodException catch");
        }

        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.err.println("NullPointerException catch");
        }

        try {
            generateNumberFormatException();
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException catch");
        }

        try {
            generateRuntimeException();
        } catch (RuntimeException e) {
            System.err.println("RuntimeException catch");
        }

        try {
            generateStringIndexOutOfBoundsException();
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("StringIndexOutOfBoundsException catch");
        }
    }

    private static void generateArithmeticException() {
        System.out.println(5 / 0);
    }

    private static void generateArrayIndexOutOfBoundsException() {
        int[] array = new int[5];
        System.out.println(array[6]);
    }

    private static void generateClassNotFoundException() throws ClassNotFoundException {
        Class.forName("FakeClass").getName();
    }

    private static void generateFileNotFoundException() throws FileNotFoundException {
        new FileReader("fakeFile.txt");
    }

    private static void generateIOException() throws IOException {
        Scanner scanner = new Scanner(new FileReader("noFile.txt"));
        scanner.next();
    }

    private static void generateNoSuchFieldException() throws NoSuchFieldException {
        String.class.getField("fakeField");
    }

    private static void generateNoSuchMethodException() throws NoSuchMethodException {
        String.class.getDeclaredMethod("fakeMethod", Integer.class);
    }

    private static void generateNullPointerException() {
        String string = null;
        string.equals("string");
    }

    private static void generateNumberFormatException() {
        Double.parseDouble("notDouble");
    }

    private static void generateRuntimeException() {
        generateNumberFormatException();
    }

    private static void generateStringIndexOutOfBoundsException() {
        String string = "string";
        string.charAt(-1);
    }
}
