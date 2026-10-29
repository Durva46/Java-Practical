import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bikes = 0, cars = 0, trucks = 0, total = 0;
        while (true) {
            System.out.print("Vehicle number (or done): ");
            String number = sc.next();
            if (number.equalsIgnoreCase("done")) break;
            System.out.print("Vehicle type (bike/car/truck): ");
            String type = sc.next().toLowerCase();
            switch (type) {
                case "bike" -> { bikes++; total += 20; }
                case "car" -> { cars++; total += 50; }
                case "truck" -> { trucks++; total += 150; }
                default -> System.out.println("Unknown vehicle type; no toll charged.");
            }
        }
        System.out.println("Total Tolls=" + total);
        System.out.println("Bikes=" + bikes + ", Cars=" + cars + ", Trucks=" + trucks);
        sc.close();
    }
}
