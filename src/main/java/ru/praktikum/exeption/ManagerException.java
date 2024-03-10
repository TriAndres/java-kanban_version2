package ru.praktikum.exeption;

public class ManagerException extends RuntimeException{
    public ManagerException(final String message) {
        super(message);
    }

    public ManagerException() {
        super();
    }
}
