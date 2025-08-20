import java.util.Scanner;

/**
 * Meta Tech Screen Exercise: A Very Big Sum
 * Problem: Sum all elements in an array, handling large numbers
 * 
 * Key Learning Points:
 * 1. Use 'long' data type for large numbers to avoid overflow
 * 2. Consider edge cases (empty array, single element)
 * 3. Input validation is important
 * 4. Time Complexity: O(n), Space Complexity: O(1)
 */
public class AVeryBigSum {
    
    /**
     * Solution 1: Simple iterative approach
     * Time Complexity: O(n) where n is the length of the array
     * Space Complexity: O(1) - only using a single variable for sum
     */
    public static long aVeryBigSum(long[] arr) {
        long sum = 0;
        for (long num : arr) {
            sum += num;
        }
        return sum;
    }
    
    /**
     * Solution 2: Using Java 8 Streams (functional approach)
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static long aVeryBigSumStream(long[] arr) {
        return java.util.Arrays.stream(arr).sum();
    }
    
    /**
     * Solution 3: With input validation and error handling
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static long aVeryBigSumWithValidation(long[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        if (arr.length == 1) {
            return arr[0];
        }
        
        long sum = 0;
        for (long num : arr) {
            // Check for potential overflow
            if (num > 0 && sum > Long.MAX_VALUE - num) {
                throw new ArithmeticException("Overflow detected");
            }
            if (num < 0 && sum < Long.MIN_VALUE - num) {
                throw new ArithmeticException("Underflow detected");
            }
            sum += num;
        }
        return sum;
    }
    
    /**
     * Solution 4: Recursive approach (for learning purposes)
     * Time Complexity: O(n)
     * Space Complexity: O(n) due to call stack
     */
    public static long aVeryBigSumRecursive(long[] arr, int index) {
        if (index == 0) {
            return arr[0];
        }
        return arr[index] + aVeryBigSumRecursive(arr, index - 1);
    }
    
    /**
     * Test all solutions with various inputs
     */
    public static void testSolutions() {
        System.out.println("=== Testing A Very Big Sum Solutions ===\n");
        
        // Test case 1: Sample input from problem
        long[] testArr1 = {1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L};
        long expected1 = 5000000015L;
        
        System.out.println("Test Case 1: Sample Input");
        System.out.println("Input: " + java.util.Arrays.toString(testArr1));
        System.out.println("Expected: " + expected1);
        
        long result1 = aVeryBigSum(testArr1);
        System.out.println("Iterative Solution: " + result1);
        System.out.println("Correct: " + (result1 == expected1));
        System.out.println();
        
        // Test case 2: Small numbers
        long[] testArr2 = {1, 2, 3, 4, 5};
        long expected2 = 15;
        
        System.out.println("Test Case 2: Small Numbers");
        System.out.println("Input: " + java.util.Arrays.toString(testArr2));
        System.out.println("Expected: " + expected2);
        
        long result2 = aVeryBigSumStream(testArr2);
        System.out.println("Stream Solution: " + result2);
        System.out.println("Correct: " + (result2 == expected2));
        System.out.println();
        
        // Test case 3: Single element
        long[] testArr3 = {42};
        long expected3 = 42;
        
        System.out.println("Test Case 3: Single Element");
        System.out.println("Input: " + java.util.Arrays.toString(testArr3));
        System.out.println("Expected: " + expected3);
        
        long result3 = aVeryBigSumWithValidation(testArr3);
        System.out.println("Validation Solution: " + result3);
        System.out.println("Correct: " + (result3 == expected3));
        System.out.println();
        
        // Test case 4: Empty array
        long[] testArr4 = {};
        long expected4 = 0;
        
        System.out.println("Test Case 4: Empty Array");
        System.out.println("Input: " + java.util.Arrays.toString(testArr4));
        System.out.println("Expected: " + expected4);
        
        long result4 = aVeryBigSumWithValidation(testArr4);
        System.out.println("Validation Solution: " + result4);
        System.out.println("Correct: " + (result4 == expected4));
        System.out.println();
        
        // Test case 5: Very large numbers
        long[] testArr5 = {Long.MAX_VALUE - 100, 50, 50};
        long expected5 = Long.MAX_VALUE;
        
        System.out.println("Test Case 5: Very Large Numbers");
        System.out.println("Input: " + java.util.Arrays.toString(testArr5));
        System.out.println("Expected: " + expected5);
        
        long result5 = aVeryBigSum(testArr5);
        System.out.println("Iterative Solution: " + result5);
        System.out.println("Correct: " + (result5 == expected5));
        System.out.println();
        
        // Test case 6: Recursive solution
        System.out.println("Test Case 6: Recursive Solution");
        System.out.println("Input: " + java.util.Arrays.toString(testArr2));
        System.out.println("Expected: " + expected2);
        
        long result6 = aVeryBigSumRecursive(testArr2, testArr2.length - 1);
        System.out.println("Recursive Solution: " + result6);
        System.out.println("Correct: " + (result6 == expected2));
        System.out.println();
    }
    
    /**
     * Main method - can be used for interactive input or running tests
     */
    public static void main(String[] args) {
        System.out.println("=== Meta Tech Screen: A Very Big Sum Exercise ===\n");
        
        // Run all test cases
        testSolutions();
        
        // Interactive input (uncomment to test with user input)
        /*
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter array size:");
        int n = scanner.nextInt();
        
        long[] arr = new long[n];
        System.out.println("Enter array elements (space-separated):");
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        
        long result = aVeryBigSum(arr);
        System.out.println("Sum: " + result);
        
        scanner.close();
        */
    }
}

/*
 * Interview Tips for this problem:
 * 
 * 1. ALWAYS ask clarifying questions:
 *    - What's the range of numbers? (to choose appropriate data type)
 *    - What should we return for empty array?
 *    - Are there any constraints on array size?
 * 
 * 2. Discuss your approach before coding:
 *    - "I'll iterate through the array and sum all elements"
 *    - "I need to use 'long' to handle large numbers"
 *    - "Time complexity is O(n), space complexity is O(1)"
 * 
 * 3. Consider edge cases:
 *    - Empty array
 *    - Single element
 *    - Very large numbers (overflow)
 *    - Negative numbers
 * 
 * 4. Optimize if possible:
 *    - Python: sum() function is optimized
 *    - Java: Streams vs manual iteration
 *    - Consider parallel processing for very large arrays
 * 
 * 5. Test your solution:
 *    - Use the sample input
 *    - Test edge cases
 *    - Verify time/space complexity
 */
