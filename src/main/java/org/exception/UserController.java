package org.exception;

public class UserController {
    static UserServiceImpl user = new UserServiceImpl();
    public static void main(String[] args) {
        try {
            user.checkingData("123_iunriunvsjnhjbuyvbrhbjnadf", "123", "123");
        } catch (WrongLoginException q) {
            System.out.println(q.getMessage());
        } catch (WrongPasswordException w) {
            System.out.println(w.getMessage());
        }
    }
}
