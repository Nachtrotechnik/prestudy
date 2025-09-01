def add(num1, num2):
    """
    Add two numbers.
    
    Args:
        num1: First number to add
        num2: Second number to add
    
    Returns:
        Sum of num1 and num2
    """
    return num1 + num2

def sub(num1, num2):
    """
    Subtract two numbers.
    
    Args:
        num1: Number to subtract from
        num2: Number to subtract
    
    Returns:
        Difference of num1 and num2
    """
    return num1 - num2

def mult(num1, num2):
    """
    Multiply two numbers.
    
    Args:
        num1: First number to multiply
        num2: Second number to multiply
    
    Returns:
        Product of num1 and num2
    """
    return num1 * num2

def div(num1, num2):
    """
    Divide two numbers.
    
    Args:
        num1: Number to be divided
        num2: Number to divide by
    
    Returns:
        Quotient of num1 divided by num2, or None if division by zero
    
    Note:
        Returns None if num2 is zero to avoid division by zero error
    """
    if num2 == 0:
        return None
    return num1 / num2

def is_even(num):
    """
    Check if a number is even.
    
    Args:
        num: Number to check
    
    Returns:
        True if num is even, False if num is odd
    """
    return num % 2 == 0

if __name__ == "__main__":
    num1 = 5
    num2 = 12
    
    # Test all functions
    result_add = add(num1, num2)
    result_sub = sub(num1, num2)
    result_mult = mult(num1, num2)
    result_div = div(num1, num2)
    result_even = is_even(num2)
    
    # Display results
    print(f"Sum: {num1} + {num2} = {result_add}")
    print(f"Subtraction: {num1} - {num2} = {result_sub}")
    print(f"Multiplication: {num1} × {num2} = {result_mult}")
    print(f"Division: {num1} ÷ {num2} = {result_div}")
    print(f"Is {num2} even? {result_even}")