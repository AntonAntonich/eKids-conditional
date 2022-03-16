import java.util.Scanner;

public class Main {

    /*
    * Написать программу "банкомат"
    *
    * 1) задать перменную балланса на карточке
    * 2) создать приветсвенное сообщение с предложением "ввести сумму для снятия"
    * 3) отобразить баланс после снятия
    * 4) задать переменные означающее действие и предоставить пользователю выбор этого дейтвия
    *
    * Уловные операторы в джаве
    * if()
    * if() - else
    * if() - else if()
    * switch - case
    * ternary
    *
    *
    * */

    public static void main(String[] args) {
        double myBalance = 1000;
        String helloMessage = "Hello, I'm ATM!\nPlease enter your value";
        String helloMessageOperation = "Hello, I'm ATM!\nPlease choose operation\n1 - check balance" +
                "\n2 - get cash\n3 - fill cash";
        String balanceMessage = "Your balance now is: ";
        String incorrectValueMessage = "Incorrect value !";
        String finishMessage = "Program finished";
        String notEnoughBalanceMessage = "You have not enough money";
        String inputMessage = "Input your money";

        final int  CHECK_BALANCE = 1;
        final int GET_CASH = 2;
        final int FILL_CASH = 3;

        System.out.println(helloMessageOperation);
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

//        if(myCash > 0) {
//            myBalance -= myCash;
//            System.out.println(balanceMessage + myBalance);
//        } else {
//            System.out.println(incorrectValueMessage);
//        }
//
//        if(myCash < 0) {
//            System.out.println(incorrectValueMessage + " You entered negative value");
//        } else if (myCash > myBalance) {
//            System.out.println(notEnoughBalanceMessage);
//            System.out.println(balanceMessage + myBalance);
//        } else {
//            myBalance -= myCash;
//            System.out.println(balanceMessage + myBalance);
//        }

//        if((myCash >= 0) && (myCash <= myBalance)) {
//            myBalance -= myCash;
//            System.out.println(balanceMessage + myBalance);
//        } else {
//            System.out.println(incorrectValueMessage);
//        }


        switch(userChoice){
            case CHECK_BALANCE:
                System.out.println(balanceMessage + myBalance);
                break;
            case GET_CASH:
                System.out.println(helloMessage);
                double userCash = scanner.nextDouble();
                myBalance -= userCash;
                System.out.println(balanceMessage + myBalance);
                break;
            case FILL_CASH:
                System.out.println(inputMessage);
                double inputCash = scanner.nextDouble();
                myBalance += inputCash;
                System.out.println(balanceMessage + myBalance);
                break;
            default:
                System.out.println(incorrectValueMessage);
        }

        System.out.println(finishMessage);
    }

}
