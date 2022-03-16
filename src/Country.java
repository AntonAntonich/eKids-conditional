import java.util.Scanner;

public class Country {

    /*
    *
    * Программа "Страны и столицы"
    *
    *  Испания - Мадрид
    *  Германия - Берлин
    *  Франция - Париж
    *
    * */

    public static void main(String[] args) {
        final String GERMANY = "Germany";
        final String SPAIN = "Spain";
        final String FRANCE = "France";

        final String MADRID = "Madrid";
        final String BERLIN = "Berlin";
        final String PARIS = "Paris";

        String helloMessage = "Enter country: ";

        System.out.println(helloMessage);
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        switch(country) {
            case GERMANY:
                System.out.println("Capital of " + GERMANY + " is: " + BERLIN);
                break;
            case SPAIN:
                System.out.println("Capital of " + SPAIN + " is: " + MADRID);
                break;
            case FRANCE:
                System.out.println("Capital of " + FRANCE + " is: " + PARIS);
                break;
            default:
                System.out.println("Good luck");
        }

        System.out.println("Program finished");

    }
}
