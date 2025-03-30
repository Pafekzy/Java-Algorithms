package DeitelChapter2Algorithm;

import java.util.Scanner;

public class GreatPyramidStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input statements
        System.out.print("Enter the estimated number of stones used: ");
        long numberOfStones = scanner.nextLong();

        System.out.print("Enter the average weight of each stone (in metric tons): ");
        double weightPerStone = scanner.nextDouble();

        System.out.print("Enter the number of years taken to build the pyramid: ");
        int yearsToBuild = scanner.nextInt();

        // Constants
        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;

        // Arithmetic operations
        double totalWeight = numberOfStones * weightPerStone;
        int totalDays = yearsToBuild * daysInYear;
        int totalHours = totalDays * hoursInDay;
        int totalMinutes = totalHours * minutesInHour;

        double weightPerYear = totalWeight / yearsToBuild;
        double weightPerHour = totalWeight / totalHours;
        double weightPerMinute = totalWeight / totalMinutes;

        // Output statements
        System.out.println("\nEstimated Construction Rate:");
        System.out.println("Per Year: " + weightPerYear + " metric tons");
        System.out.println("Per Hour: " + weightPerHour + " metric tons");
        System.out.println("Per Minute: " + weightPerMinute + " metric tons");

        scanner.close();
    }
}
