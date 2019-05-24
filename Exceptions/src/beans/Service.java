package beans;

import exceptions.CloseException;
import exceptions.DaoException;
import exceptions.ServiceException;

class Service {
    static void doSomething() throws ServiceException {
        try {
            DAO.doSomething();
        } catch (DaoException e) {
            throw new ServiceException();
        }
    }

    static void close() throws CloseException {
        throw new CloseException();
    }
}
