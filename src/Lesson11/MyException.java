package Lesson11;

public class MyException extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }

    public MyException(String message, int num) {

        super(message);
        number = num;
    }
}
