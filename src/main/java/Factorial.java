import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

public class Factorial {
    public static void main(String[] args) {
        //factorial();
        //System.out.println(calculateFactorial(5));
        //factorialWithWhile();
        System.out.println(calculateFactorialWithWhile(5));
    }

    public static void factorial() {
        int a = 1;
        for (int i = 0; i <= 10; i++) {
            if (i == 0) {
                System.out.println(1);
            } else {
                int factorial = i * a;
                System.out.println(factorial);
                a = factorial;
            }

        }
    }

    public static int calculateFactorial(int value) {
        int factorial = 1;
        if (value == 0) {
            factorial = 1;
        } else {

            for (int i = 1; i <= value; i++) {
                factorial = i * factorial;
            }
        }
        return factorial;
    }

    public static void factorialWithWhile() {
        int i = 1;
        int factorial = 1;
        while (i < 10) {
            factorial = i * factorial;
            System.out.println(factorial);
            i++;
        }
    }

    public static int calculateFactorialWithWhile(int value) {
        if (value >= 0) {
            int factorial = 1;
            if (value == 0) {
                factorial = 1;
            } else {
                int i = 1;

                while (i <= value) {
                    factorial = i * factorial;
                    i++;
                }
            }
            return factorial;
        } else {
            return -1;
        }
    }
}
