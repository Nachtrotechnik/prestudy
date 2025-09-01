def left_rotate_array(original_array, d):
    """
    Rotate an array to the left by d positions.
    
    Args:
        original_array: List to rotate
        d: Number of positions to rotate left
    
    Returns:
        Rotated array, or False if invalid input
    """
    print(f"Original Array: {original_array}")
    
    # Check edge cases
    if original_array == []:
        return False
    if d == 0:
        return False
    if d < 0:
        return False
    
    # Create copy and perform rotation
    result_array = original_array[:]
    
    for i in range(len(original_array)):
        new_index = (i - d) % len(original_array)
        result_array[new_index] = original_array[i]
    
    print(f"Rotated Array: {result_array}")
    return result_array


# Test code
if __name__ == "__main__":
    print("=== Testing Left Rotation Function ===\n")
    
    # Test 1: Basic rotation
    print("Test 1: Basic rotation")
    test_array = [1, 2, 3, 4, 5]
    result = left_rotate_array(test_array, 2)
    print(f"Result: {result}\n")
    
    # Test 2: Zero rotation
    print("Test 2: Zero rotation")
    result = left_rotate_array([1, 2, 3, 4, 5], 0)
    print(f"Result: {result}\n")
    
    # Test 3: Empty array
    print("Test 3: Empty array")
    result = left_rotate_array([], 2)
    print(f"Result: {result}\n")
    
    # Test 4: Large rotation count
    print("Test 4: Large rotation count")
    result = left_rotate_array([1, 2, 3, 4, 5], 7)
    print(f"Result: {result}\n")
    
    # Test 5: Single element array
    print("Test 5: Single element array")
    result = left_rotate_array([42], 1)
    print(f"Result: {result}\n")
    
    print("=== All Tests Complete! ===")
