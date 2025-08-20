# Week 1: Python Basics

## Learning Objectives
- [ ] Review Python basics: syntax, data types, control flow
- [ ] Learn Python functions and data structures (lists, dictionaries, sets)
- [ ] Complete 5-10 basic Python problems

## 1. Python Syntax Fundamentals

### Basic Structure
```python
# This is a comment
print("Hello, World!")  # Basic output

# Variables and assignment
name = "Student"
age = 25
is_student = True
```

### Data Types
```python
# Numeric types
integer_num = 42          # int
float_num = 3.14         # float
complex_num = 1 + 2j     # complex

# Text type
string_text = "Hello"    # str

# Boolean type
boolean_val = True       # bool

# Check type
print(type(integer_num))  # <class 'int'>
```

## 2. Control Flow

### Conditional Statements
```python
age = 18

if age >= 18:
    print("Adult")
elif age >= 13:
    print("Teenager")
else:
    print("Child")

# Ternary operator
status = "Adult" if age >= 18 else "Minor"
```

### Loops
```python
# For loop
for i in range(5):
    print(i)  # Prints 0, 1, 2, 3, 4

# While loop
count = 0
while count < 3:
    print(count)
    count += 1

# Loop with break and continue
for i in range(10):
    if i == 5:
        continue  # Skip 5
    if i == 8:
        break     # Stop at 8
    print(i)
```

## 3. Functions

### Basic Function Definition
```python
def greet(name):
    """This function greets the person passed in as a parameter"""
    return f"Hello, {name}!"

# Function call
message = greet("Alice")
print(message)  # Hello, Alice!

# Function with multiple parameters
def add_numbers(a, b):
    return a + b

result = add_numbers(5, 3)  # 8
```

### Function Parameters
```python
# Default parameters
def greet_with_title(name, title="Mr."):
    return f"Hello, {title} {name}!"

print(greet_with_title("Smith"))           # Hello, Mr. Smith!
print(greet_with_title("Johnson", "Dr.")) # Hello, Dr. Johnson!

# Variable number of arguments
def sum_all(*args):
    return sum(args)

print(sum_all(1, 2, 3, 4))  # 10

# Keyword arguments
def person_info(**kwargs):
    for key, value in kwargs.items():
        print(f"{key}: {value}")

person_info(name="John", age=30, city="NYC")
```

## 4. Data Structures

### Lists
```python
# Creating lists
numbers = [1, 2, 3, 4, 5]
mixed = [1, "hello", 3.14, True]

# List operations
print(len(numbers))        # 5
print(numbers[0])          # 1 (indexing starts at 0)
print(numbers[-1])         # 5 (negative indexing)

# List methods
numbers.append(6)          # Add to end
numbers.insert(0, 0)      # Insert at specific position
numbers.remove(3)          # Remove first occurrence
popped = numbers.pop()     # Remove and return last element

# List comprehension
squares = [x**2 for x in range(5)]  # [0, 1, 4, 9, 16]
```

### Dictionaries
```python
# Creating dictionaries
student = {
    "name": "Alice",
    "age": 20,
    "courses": ["Math", "Physics"]
}

# Accessing values
print(student["name"])                    # Alice
print(student.get("age"))                 # 20
print(student.get("grade", "N/A"))       # N/A (default value)

# Modifying dictionaries
student["age"] = 21                      # Update value
student["grade"] = "A"                   # Add new key-value pair
del student["age"]                        # Remove key-value pair

# Dictionary methods
print(student.keys())                     # dict_keys(['name', 'courses', 'grade'])
print(student.values())                   # dict_values(['Alice', ['Math', 'Physics'], 'A'])
print(student.items())                    # dict_items([('name', 'Alice'), ...])
```

### Sets
```python
# Creating sets
numbers = {1, 2, 3, 4, 5}
unique_letters = set("hello")  # {'h', 'e', 'l', 'o'}

# Set operations
numbers.add(6)               # Add element
numbers.remove(1)            # Remove element (raises error if not found)
numbers.discard(10)          # Remove element (no error if not found)

# Set operations
set1 = {1, 2, 3}
set2 = {3, 4, 5}
print(set1.union(set2))      # {1, 2, 3, 4, 5}
print(set1.intersection(set2)) # {3}
print(set1.difference(set2))   # {1, 2}
```

## 5. Practice Problems

### Problem 1: Find the largest number in a list
```python
def find_max(numbers):
    if not numbers:
        return None
    max_num = numbers[0]
    for num in numbers:
        if num > max_num:
            max_num = num
    return max_num

# Test
test_numbers = [3, 7, 2, 9, 1]
print(find_max(test_numbers))  # 9
```

### Problem 2: Count word frequency
```python
def word_frequency(text):
    words = text.lower().split()
    frequency = {}
    for word in words:
        frequency[word] = frequency.get(word, 0) + 1
    return frequency

# Test
text = "hello world hello python world"
print(word_frequency(text))
# Output: {'hello': 2, 'world': 2, 'python': 1}
```

### Problem 3: Check if string is palindrome
```python
def is_palindrome(text):
    cleaned = ''.join(char.lower() for char in text if char.isalnum())
    return cleaned == cleaned[::-1]

# Test
print(is_palindrome("A man, a plan, a canal: Panama"))  # True
print(is_palindrome("hello"))                          # False
```

## 6. Next Steps
1. Practice these concepts with the provided examples
2. Complete the practice problems
3. Try creating your own variations
4. Move to Java OOP concepts when ready

## Resources
- [Python Official Documentation](https://docs.python.org/3/)
- [Python Tutorial](https://docs.python.org/3/tutorial/)
- [Real Python](https://realpython.com/) - Excellent tutorials and examples
