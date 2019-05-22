package beans;

import exceptions.DaoException;

class DAO {
    static void doSomething() throws DaoException, RuntimeException {
        if (Math.random() < 0.5) {
            throw new DaoException();
        } else {
            throw new RuntimeException("RuntimeExceptionMessage");
        }
    }
}
