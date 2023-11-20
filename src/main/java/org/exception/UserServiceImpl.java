package org.exception;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service

public class UserServiceImpl implements UserService {
    String login;
    String pass;
    String confirmPass;

    public static void checkingData (String login, String pass, String confirmPass) throws Exception {
        char[] charLoginArray = login.toCharArray();
        char[] charPassArray = pass.toCharArray();
            if ((charLoginArray.length > 20) || (!login.matches("^[a-zA-Z0-9_]*$"))) {
                throw new WrongLoginException();
            }

            if ((charPassArray.length > 20) || (!pass.matches("^[a-zA-Z0-9_]*$"))) {
                throw new WrongPasswordException();
            }

            if (!confirmPass.equals(pass)) {
                throw new WrongPasswordException();
                System.out.println("Пароли не совпадают");
            }

    }

}
