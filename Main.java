import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create and populate the array
        int[] numbers = new int[9];
        System.out.println("Please enter 9 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Method 1: Arrays.stream() with count
        long countStream = Arrays.stream(numbers).filter(num -> num > 19).count();
        System.out.println("Count using Arrays.stream(): " + countStream);

        // Method 2: Arrays.copyOf() and manual iteration
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        int countCopy = 0;
        for (int num : copiedArray) {
            if (num > 19) countCopy++;
        }
        System.out.println("Count using Arrays.copyOf(): " + countCopy);

        // Method 3: Arrays.parallelSort() and binary search
        Arrays.parallelSort(numbers); // Sort the array in parallel
        int index = Arrays.binarySearch(numbers, 20);
        if (index < 0) index = -index - 1; // Adjust to find first element > 19
        int countBinary = numbers.length - index;
        System.out.println("Count using Arrays.parallelSort() and binary search: " + countBinary);

        // Method 4: Arrays.toString() for output and manual counting
        System.out.println("Array contents: " + Arrays.toString(numbers));
        int countManual = 0;
        for (int num : numbers) {
            if (num > 19) countManual++;
        }
        System.out.println("Count using manual counting: " + countManual);
    }
}
