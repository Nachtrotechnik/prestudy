// Big O Notation Examples - August 22, 2025
// Java Implementation

import java.util.*;

public class BigONotationExamples {
    
    // O(1) - Constant Time
    public static Integer getFirstElement(int[] array) {
        // Always takes the same time regardless of array size
        return array.length > 0 ? array[0] : null;
    }
    
    // O(n) - Linear Time
    public static boolean findElement(int[] array, int target) {
        // Time grows linearly with array size
        for (int element : array) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
    
    // O(n²) - Quadratic Time
    public static void printPairs(int[] array) {
        // Time grows quadratically - nested loops
        for (int x : array) {
            for (int y : array) {
                System.out.println("(" + x + ", " + y + ")");
            }
        }
    }
    
    // O(log n) - Logarithmic Time
    public static int binarySearch(int[] array, int target) {
        // Time grows logarithmically - divide and conquer
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    // O(n log n) - Linearithmic Time
    public static int[] mergeSort(int[] array) {
        // Time grows as n * log n - efficient sorting
        if (array.length <= 1) {
            return array;
        }
        
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        
        left = mergeSort(left);
        right = mergeSort(right);
        
        return merge(left, right);
    }
    
    private static int[] merge(int[] left, int[] right) {
        // Helper function for merge sort
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            result[k++] = left[i++];
        }
        
        while (j < right.length) {
            result[k++] = right[j++];
        }
        
        return result;
    }
    
    // Time Complexity Analysis Examples
    
    // Example 1: O(1) - Constant time
    public static int getArrayLength(int[] array) {
        return array.length; // Always O(1)
    }
    
    // Example 2: O(n) - Linear time
    public static int sumArray(int[] array) {
        int total = 0;
        for (int num : array) { // Single loop = O(n)
            total += num;
        }
        return total;
    }
    
    // Example 3: O(n²) - Quadratic time
    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        int[] sortedArray = array.clone();
        
        for (int i = 0; i < n; i++) {           // Outer loop: O(n)
            for (int j = 0; j < n - i - 1; j++) {  // Inner loop: O(n)
                if (sortedArray[j] > sortedArray[j + 1]) {
                    // Swap elements
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }
        return sortedArray;
    }
    
    // Example 4: O(n³) - Cubic time (avoid this!)
    public static List<List<Integer>> findTriplets(int[] array) {
        int n = array.length;
        List<List<Integer>> triplets = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {           // O(n)
            for (int j = 0; j < n; j++) {       // O(n)
                for (int k = 0; k < n; k++) {   // O(n)
                    if (array[i] + array[j] + array[k] == 0) {
                        List<Integer> triplet = Arrays.asList(array[i], array[j], array[k]);
                        triplets.add(triplet);
                    }
                }
            }
        }
        return triplets;
    }
    
    // Practice Question:
    // What's the time complexity of this function?
    public static List<Integer> mysteryFunction(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                result.add(array[i] + array[j]);
            }
        }
        return result;
    }
    
    // Answer: O(n²) - The inner loop runs fewer times than n, but still O(n²)
    
    // Main method to test the functions
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
        
        System.out.println("Testing Big O Notation Examples:");
        System.out.println("================================");
        
        // Test O(1) function
        System.out.println("O(1) - First element: " + getFirstElement(testArray));
        
        // Test O(n) function
        System.out.println("O(n) - Find element 3: " + findElement(testArray, 3));
        
        // Test O(n²) function
        System.out.println("O(n²) - Print pairs:");
        printPairs(new int[]{1, 2, 3});
        
        // Test O(log n) function
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("O(log n) - Binary search for 7: " + binarySearch(sortedArray, 7));
        
        // Test O(n log n) function
        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90};
        int[] sorted = mergeSort(unsortedArray);
        System.out.println("O(n log n) - Merge sort result: " + Arrays.toString(sorted));
        
        // Test O(n) function
        System.out.println("O(n) - Sum of array: " + sumArray(testArray));
        
        // Test O(n²) function
        int[] bubbleSorted = bubbleSort(new int[]{64, 34, 25, 12, 22, 11, 90});
        System.out.println("O(n²) - Bubble sort result: " + Arrays.toString(bubbleSorted));
        
        // Test mystery function
        List<Integer> mysteryResult = mysteryFunction(new int[]{1, 2, 3});
        System.out.println("Mystery function result: " + mysteryResult);
    }
}

/*
Key Takeaways:
1. O(1) - Best case, constant time
2. O(log n) - Very good, logarithmic growth
3. O(n) - Good, linear growth
4. O(n log n) - Acceptable, linearithmic growth
5. O(n²) - Poor, quadratic growth
6. O(n³) - Very poor, cubic growth
7. O(2ⁿ) - Terrible, exponential growth

Java-specific notes:
- Use 'public static' for utility functions
- Arrays have fixed length, use ArrayList for dynamic sizing
- Use 'void' for functions that don't return values
- Use 'Integer' instead of 'int' when you need to return null
- Use 'Arrays.toString()' to print arrays nicely
*/