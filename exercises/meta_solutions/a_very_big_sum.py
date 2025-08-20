# Meta Tech Screen Exercise: A Very Big Sum
# Problem: Sum all elements in an array, handling large numbers

def a_very_big_sum_pythonic(arr):
    """
    Pythonic solution - Python handles large integers automatically
    Time Complexity: O(n) where n is the length of the array
    Space Complexity: O(1) - only using a single variable for sum
    """
    return sum(arr)

def a_very_big_sum_iterative(arr):
    """
    Iterative solution - more explicit for understanding
    Time Complexity: O(n) where n is the length of the array
    Space Complexity: O(1) - only using a single variable for sum
    """
    total = 0
    for num in arr:
        total += num
    return total

def a_very_big_sum_with_validation(arr):
    """
    Solution with input validation and error handling
    Time Complexity: O(n) where n is the length of the array
    Space Complexity: O(1)
    """
    if not arr:  # Check if array is empty
        return 0
    
    if len(arr) == 1:  # Single element case
        return arr[0]
    
    total = 0
    for num in arr:
        if not isinstance(num, (int, float)):  # Type checking
            raise ValueError(f"Invalid input: {num} is not a number")
        total += num
    
    return total

# Test cases
def test_solutions():
    """Test all solutions with various inputs"""
    
    # Test case 1: Sample input from problem
    test_arr1 = [1000000001, 1000000002, 1000000003, 1000000004, 1000000005]
    expected1 = 5000000015
    
    print("Test Case 1: Sample Input")
    print(f"Input: {test_arr1}")
    print(f"Expected: {expected1}")
    
    result1 = a_very_big_sum_pythonic(test_arr1)
    print(f"Pythonic Solution: {result1}")
    print(f"Correct: {result1 == expected1}")
    print()
    
    # Test case 2: Small numbers
    test_arr2 = [1, 2, 3, 4, 5]
    expected2 = 15
    
    print("Test Case 2: Small Numbers")
    print(f"Input: {test_arr2}")
    print(f"Expected: {expected2}")
    
    result2 = a_very_big_sum_iterative(test_arr2)
    print(f"Iterative Solution: {result2}")
    print(f"Correct: {result2 == expected2}")
    print()
    
    # Test case 3: Single element
    test_arr3 = [42]
    expected3 = 42
    
    print("Test Case 3: Single Element")
    print(f"Input: {test_arr3}")
    print(f"Expected: {expected3}")
    
    result3 = a_very_big_sum_with_validation(test_arr3)
    print(f"Validation Solution: {result3}")
    print(f"Correct: {result3 == expected3}")
    print()
    
    # Test case 4: Empty array
    test_arr4 = []
    expected4 = 0
    
    print("Test Case 4: Empty Array")
    print(f"Input: {test_arr4}")
    print(f"Expected: {expected4}")
    
    result4 = a_very_big_sum_with_validation(test_arr4)
    print(f"Validation Solution: {result4}")
    print(f"Correct: {result4 == expected4}")
    print()
    
    # Test case 5: Very large numbers
    test_arr5 = [10**18, 10**18, 10**18]
    expected5 = 3 * (10**18)
    
    print("Test Case 5: Very Large Numbers")
    print(f"Input: {test_arr5}")
    print(f"Expected: {expected5}")
    
    result5 = a_very_big_sum_pythonic(test_arr5)
    print(f"Pythonic Solution: {result5}")
    print(f"Correct: {result5 == expected5}")
    print()

# Main execution
if __name__ == "__main__":
    print("=== Meta Tech Screen: A Very Big Sum Exercise ===\n")
    
    # Run all test cases
    test_solutions()
    
    # Interactive input (uncomment to test with user input)
    """
    print("Enter array size:")
    n = int(input())
    
    print("Enter array elements (space-separated):")
    arr = list(map(int, input().split()))
    
    result = a_very_big_sum_pythonic(arr)
    print(f"Sum: {result}")
    """

# Learning Points:
# 1. Python automatically handles large integers (no overflow)
# 2. sum() function is more efficient than manual iteration
# 3. Always consider edge cases (empty array, single element)
# 4. Input validation is important for robust solutions
# 5. Time complexity is O(n) - we must visit each element once
# 6. Space complexity is O(1) - we only use constant extra space
