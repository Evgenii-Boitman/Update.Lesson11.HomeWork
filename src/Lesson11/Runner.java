package Lesson11;

import javax.management.InvalidApplicationException;

public class Runner {

    public static void main(String[] args) throws MyException {
        int num = 0;
        int result = 1;
        if (num < 1) throw new MyException("The number is less than 1", num);

        for (int i = 1; i <= num; i++) {

            result *= i;
        }

        try {
            throw new MyException1 ("Some text");
        } catch (MyException1 e) {
            e.printStackTrace();
        }
    }
}
