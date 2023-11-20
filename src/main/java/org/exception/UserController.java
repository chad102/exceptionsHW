package org.exception;

import static org.exception.UserServiceImpl.checkingData;

public class UserController {
    public static void main(String[] args) {
    try {
        checkingData("123", "123", "123");
    } catch (WrongLoginException q) {
        System.out.println("Недопустимые символы в пароле.");
    } catch (WrongPasswordException w) {
        System.out.println("Недопустимые символы в пароле.");
    } catch (WrongPasswordException e){
        System.out.println("Пароли не совпадают.");
    }
}
