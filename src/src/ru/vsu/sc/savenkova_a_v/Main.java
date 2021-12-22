package src.ru.vsu.sc.savenkova_a_v;

import java.util.Locale;
import java.util.Scanner;

import static src.ru.vsu.sc.savenkova_a_v.Picture.printColorForPoint;
import static src.ru.vsu.sc.savenkova_a_v.Test.printPointsInEachArea;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        printPointsInEachArea();

        System.out.print("Input х:");
        double x = readNumber();

        System.out.print("Input y:");
        double y = readNumber();

        printColorForPoint(x, y);
    }

    public static double readNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
