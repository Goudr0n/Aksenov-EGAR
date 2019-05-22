import beans.Controller;
import beans.Main;
import exceptions.ApplicationException;
import exceptions.CloseException;

public class ExceptionsRunner {
    public static void main(String[] args) {
        try {
            System.out.println("\tMain exceptions:");
            Main.run();
            System.out.println("\n\tController exceptions:");
            Controller.run();
        } catch (CloseException e) {
            System.err.println(e.getMessage() + " catch in ExceptionsRunner");
        } catch (ApplicationException e) {
            System.err.println(e.getMessage() + " catch in ExceptionsRunner");
        }
    }
}
