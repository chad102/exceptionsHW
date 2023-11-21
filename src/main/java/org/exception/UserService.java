package org.exception;

public interface UserService {
    public void checkingData(String login, String pass, String confirmPass) throws WrongLoginException, WrongPasswordException;
}
