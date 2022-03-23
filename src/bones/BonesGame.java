package bones;

import java.util.Scanner;

public class BonesGame {
    /*
     *
     *   Math.random()  - генерирурет случайно число от 0 до 1
     *  0.1
     *   0.25
     * ...
     *
     *
     * */

    public static void main(String[] args) {
        String playerNameOne = "Mike";
        String playerNameTwo = "Nick";
        final String THROW_MSG = " your turn to throw";
        final String THROW_MSG_TURN = "To throw press 1";
        final String VALUE_REPORT = "your value ";
        final String WIN_MESSAGE = " WIN !!!";
        final String DRAW_MESSAGE = " DRAW";
        final int MAX_VALUE = 12;

        System.out.println(playerNameOne + THROW_MSG);
        System.out.println(THROW_MSG_TURN);
        Scanner scanner = new Scanner(System.in);
        scanner.nextDouble();
        double playerOneThrow = (int) ((Math.random() * MAX_VALUE) + 1);
        System.out.println(VALUE_REPORT + playerOneThrow);

        System.out.println(playerNameTwo + THROW_MSG);
        System.out.println(THROW_MSG_TURN);
        scanner.nextDouble();
        double playerTwoThrow = (int) ((Math.random() * MAX_VALUE) + 1);
        System.out.println(VALUE_REPORT + playerTwoThrow);


        if(playerOneThrow > playerTwoThrow) {
            System.out.println(playerNameOne + WIN_MESSAGE);
        } else if(playerTwoThrow > playerOneThrow) {
            System.out.println(playerNameTwo + WIN_MESSAGE);
        } else {
            System.out.println(DRAW_MESSAGE);
        }

        System.out.println("end");
    }
}
