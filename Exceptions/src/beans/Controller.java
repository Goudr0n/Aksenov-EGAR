package beans;

import exceptions.ApplicationException;
import exceptions.CloseException;
import exceptions.ServiceException;

public class Controller {
    public static void run() throws ApplicationException, CloseException {
        try {
            Service.doSomething();
        } catch (ServiceException e) {
            System.err.println(e.getMessage() + " catch in Controller");
            throw new ApplicationException();
        } catch (RuntimeException e) {
            System.err.println(e.getMessage() + " catch in Controller");
            throw new ApplicationException();
        } finally {
            Service.close();
        }
    }
}
