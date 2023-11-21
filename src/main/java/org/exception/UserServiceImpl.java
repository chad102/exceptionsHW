package org.exception;

public class UserServiceImpl implements UserService {
    @Override
    public void checkingData(String login, String pass, String confirmPass) throws WrongLoginException, WrongPasswordException {
        char[] charLoginArray = login.toCharArray();
        char[] charPassArray = pass.toCharArray();


        if ((charLoginArray.length > 20) || (!login.matches("^[a-zA-Z0-9_]*$"))) {
            throw new WrongLoginException("Длина логина превышает допустимые значения или недопустимые символы в логине");
        }

        if ((charPassArray.length > 20) || (!pass.matches("^[a-zA-Z0-9_]*$"))) {
            throw new WrongPasswordException("Длина пароля превышает допустимые значения или недопустимые символы в пароле");
        }

        if (!pass.equals(confirmPass)) {
            System.out.println("[[[[f,kldnfsl");
            throw new WrongPasswordException("Пароли не совпадают");

        }

    }
}
