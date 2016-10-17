import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();

        while (true) {
            System.out.print("Enter a number: ");
            double num = in.nextDouble();
            if (num == -1) {
                break;
            }
            numbers.add(num);
        }

        System.out.println("# of items: " + numbers.size());
        System.out.println("Average: " + calculateAverage(numbers));
        System.out.println("Standard Deviation: " + calculateStandardDeviation(numbers));
        System.out.println("Sum od odd: " + sumOddNumbers(numbers));
    }

    private static double sumOddNumbers(ArrayList<Double> numbers) {
        ArrayList<Double> oddNumbers = getOddNumbers(numbers);
        double sum = 0;
        for (double number : oddNumbers) {
            sum += number;
        }

        return sum;
    }

    private static double calculateStandardDeviation(ArrayList<Double> numbers) {
        ArrayList<Double> evenNumbers = getEvenNumbers(numbers);
        double average = calculateAverage(evenNumbers);
        ArrayList<Double> deviations = calculateDeviations(evenNumbers, average);
        double variance = calculateAverage(deviations);
        return Math.sqrt(variance);
    }

    private static ArrayList<Double> getEvenNumbers(ArrayList<Double> numbers) {
        ArrayList<Double> result = new ArrayList<>();

        for (double number : numbers) {
            if (number % 2 == 0) {
                result.add(number);
            }
        }

        return result;
    }
    private static ArrayList<Double> getOddNumbers(ArrayList<Double> numbers) {
        ArrayList<Double> result = new ArrayList<>();

        for (double number : numbers) {
            if (number % 2 != 0) {
                result.add(number);
            }
        }

        return result;
    }

    private static ArrayList<Double> calculateDeviations(ArrayList<Double> numbers, double average) {
        ArrayList<Double> result = new ArrayList<>();

        for(double number : numbers){
            result.add(Math.pow(number - average, 2));
        }

        return result;
    }

    private static double calculateAverage(ArrayList<Double> numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }
}
