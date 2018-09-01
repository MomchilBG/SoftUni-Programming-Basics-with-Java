package L01FirstStepsInCoding.exercise;

import java.util.Scanner;

public class Pr04RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double a = Double.parseDouble(scanner.nextLine());
        Double b = Double.parseDouble(scanner.nextLine());
        System.out.println(a * b);
    }
}
