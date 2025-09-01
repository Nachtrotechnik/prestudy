"""
Math Utilities Module
A simple module demonstrating Python modules and imports
"""

def add(a, b):
    """Add two numbers"""
    return a + b

def subtract(a, b):
    """Subtract b from a"""
    return a - b

def multiply(a, b):
    """Multiply two numbers"""
    return a * b

def divide(a, b):
    """Divide a by b with error handling"""
    try:
        return a / b
    except ZeroDivisionError:
        return "Error: Cannot divide by zero"

def power(base, exponent):
    """Raise base to the power of exponent"""
    return base ** exponent

def factorial(n):
    """Calculate factorial of n"""
    if n < 0:
        return "Error: Factorial not defined for negative numbers"
    elif n == 0 or n == 1:
        return 1
    else:
        result = 1
        for i in range(2, n + 1):
            result *= i
        return result

# This is the key concept: __name__ == "__main__"
# This code only runs when the file is executed directly
# It doesn't run when the module is imported
if __name__ == "__main__":
    print("Testing math_utils module directly:")
    print(f"add(5, 3) = {add(5, 3)}")
    print(f"multiply(4, 7) = {multiply(4, 7)}")
    print(f"factorial(5) = {factorial(5)}")
    print(f"divide(10, 0) = {divide(10, 0)}")
else:
    print("math_utils module imported successfully!")
