package második_maxmin;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class második_maxmin {
    public static void main(String[] args) {
        int n = readElementCount();
        double[] numbers = readNumbers(n);
        List<Double> filteredNumbers = filterNumbers(numbers, 0.4, 0.5);
        System.out.println("A 0,4 és 0,5 közötti számok:");
        printNumbers(filteredNumbers);
        System.out.println("\nStatisztikák:");
        printStatistics(filteredNumbers);
    }
    
    public static int readElementCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adja meg a tömb elemeinek számát: ");
        int n = scanner.nextInt();
        return n;
    }
    
    public static double[] readNumbers(int n) {
        double[] array = new double[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a számokat:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }
    
    public static List<Double> filterNumbers(double[] numbers, double low, double high) {
        List<Double> filtered = new ArrayList<>();
        for (double num : numbers) {
            if (num >= low && num <= high) {
                filtered.add(num);
            }
        }
        return filtered;
    }
    
    public static void printNumbers(List<Double> numbers) {
        for (double num : numbers) {
            System.out.println(num);
        }
    }
    
    public static void printStatistics(List<Double> numbers) {
        int count = numbers.size();
        if (count == 0) {
            System.out.println("Nincs olyan szám, amely 0,4 és 0,5 közé esne.");
            return;
        }
        double sum = 0;
        double max = numbers.get(0);
        double min = numbers.get(0);
        for (double num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        double average = sum / count;
        System.out.println("Darabszám: " + count);
        System.out.println("Átlag: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
