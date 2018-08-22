import java.util.Scanner;
import java.util.SortedMap;

public class Switch_Nasted {
    public static void main(String[] args) {
        nastedSwitch();
    }

    public static void nastedSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj co chcesz srobić\n(Wybierz--1) Dodawanie\n(Wybierz--2) Odejmowanie");

        int dzialanie = scanner.nextInt();
        while (true) {
            switch (dzialanie) {
                case 1:
                    System.out.println("Podaj pierwsza liczbe: ");
                    int a = scanner.nextInt();
                    System.out.println("Podaj druga liczbe: ");
                    int b = scanner.nextInt();
                    int wynik_dodawania = a + b;

                    System.out.println("Czy wyswietlić wynik???\nT/N\nWyjście (Q)");
                    String respond = scanner.next();

                    switch (respond) {
                        case "T":
                            System.out.println("Wynik dodawania to ---> " + wynik_dodawania);
                            break;
                        case "N":
                            System.out.println("Nie wyswietlam wyniku");
                            break;
                        default:
                            System.out.println("Wybierz T/N");
                    }

                    break;
                case 2:
                    System.out.println("Podaj pierwszą liczbe: ");
                    int c = scanner.nextInt();
                    System.out.println("Podaj drugą liczbe: ");
                    int d = scanner.nextInt();
                    int wynik_odejmowania = c - d;
                    System.out.println("Czy wyswietlić wynik???\nT/N\nWyjście (Q)");
                    String respond2 = scanner.next();

                    switch (respond2) {
                        case "T":
                            System.out.println("Wynik odejmowania to ---> " + wynik_odejmowania);
                            break;
                        case "N":
                            System.out.println("Wynik odejmowania to ---> " + wynik_odejmowania);
                            break;
                        default:
                            System.out.println("Wybierz T/N");
                    }

                    break;

                default:
                    System.out.println("Zły numer");
            }
        }
    }
}
