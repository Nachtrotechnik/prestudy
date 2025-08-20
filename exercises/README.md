# Week 1: Practice Exercises

## Learning Objectives
- [ ] Complete 5-10 basic Python problems
- [ ] Practice Java OOP concepts

## Python Exercises

### Exercise 1: Temperature Converter
Create a function that converts temperatures between Celsius and Fahrenheit.

```python
def celsius_to_fahrenheit(celsius):
    """Convert Celsius to Fahrenheit"""
    # Your code here
    pass

def fahrenheit_to_celsius(fahrenheit):
    """Convert Fahrenheit to Celsius"""
    # Your code here
    pass

# Test cases
print(celsius_to_fahrenheit(0))      # Should print 32.0
print(celsius_to_fahrenheit(100))    # Should print 212.0
print(fahrenheit_to_celsius(32))     # Should print 0.0
print(fahrenheit_to_celsius(212))    # Should print 100.0
```

**Expected Output:**
```
32.0
212.0
0.0
100.0
```

### Exercise 2: List Operations
Create functions to perform various list operations.

```python
def find_duplicates(numbers):
    """Find and return duplicate numbers in a list"""
    # Your code here
    pass

def remove_duplicates(numbers):
    """Remove duplicates from a list while preserving order"""
    # Your code here
    pass

def merge_sorted_lists(list1, list2):
    """Merge two sorted lists into one sorted list"""
    # Your code here
    pass

# Test cases
numbers = [1, 2, 3, 2, 4, 5, 3, 6]
print(find_duplicates(numbers))           # Should print [2, 3]

list1 = [1, 3, 5, 7]
list2 = [2, 4, 6, 8]
print(merge_sorted_lists(list1, list2))  # Should print [1, 2, 3, 4, 5, 6, 7, 8]
```

### Exercise 3: Dictionary Operations
Create functions to work with dictionaries.

```python
def count_characters(text):
    """Count the frequency of each character in a string"""
    # Your code here
    pass

def merge_dictionaries(dict1, dict2):
    """Merge two dictionaries, dict2 values override dict1 if keys conflict"""
    # Your code here
    pass

def find_most_frequent(dictionary):
    """Find the key with the highest value in a dictionary"""
    # Your code here
    pass

# Test cases
text = "hello world"
print(count_characters(text))

dict1 = {'a': 1, 'b': 2}
dict2 = {'b': 3, 'c': 4}
print(merge_dictionaries(dict1, dict2))

freq = {'a': 5, 'b': 10, 'c': 3}
print(find_most_frequent(freq))
```

### Exercise 4: String Manipulation
Create functions for string operations.

```python
def reverse_words(sentence):
    """Reverse the order of words in a sentence"""
    # Your code here
    pass

def is_anagram(str1, str2):
    """Check if two strings are anagrams"""
    # Your code here
    pass

def capitalize_words(sentence):
    """Capitalize the first letter of each word in a sentence"""
    # Your code here
    pass

# Test cases
print(reverse_words("hello world python"))  # Should print "python world hello"
print(is_anagram("listen", "silent"))       # Should print True
print(is_anagram("hello", "world"))         # Should print False
print(capitalize_words("hello world"))      # Should print "Hello World"
```

### Exercise 5: Number Operations
Create functions for mathematical operations.

```python
def is_prime(number):
    """Check if a number is prime"""
    # Your code here
    pass

def fibonacci_sequence(n):
    """Generate first n Fibonacci numbers"""
    # Your code here
    pass

def factorial(n):
    """Calculate factorial of a number"""
    # Your code here
    pass

# Test cases
print(is_prime(17))              # Should print True
print(is_prime(24))              # Should print False
print(fibonacci_sequence(8))     # Should print [0, 1, 1, 2, 3, 5, 8, 13]
print(factorial(5))              # Should print 120
```

## Java OOP Exercises

### Exercise 6: Student Management System
Create a complete student management system using OOP principles.

```java
// Create these classes:
// 1. Student class with attributes and methods
// 2. Course class with attributes and methods
// 3. StudentManager class to manage students and courses
// 4. Main class to test the system

// Requirements:
// - Use encapsulation (private fields, public methods)
// - Implement inheritance (create different types of students)
// - Use polymorphism (different student types)
// - Apply abstraction (abstract methods where appropriate)
```

### Exercise 7: Bank Account System
Implement a bank account system with different account types.

```java
// Create these classes:
// 1. Account (abstract base class)
// 2. SavingsAccount (extends Account)
// 3. CheckingAccount (extends Account)
// 4. Bank class to manage accounts

// Features to implement:
// - Deposit and withdrawal methods
// - Interest calculation for savings
// - Overdraft protection for checking
// - Account transfer functionality
```

### Exercise 8: Shape Calculator
Create a shape hierarchy with area and perimeter calculations.

```java
// Create these classes:
// 1. Shape (abstract base class)
// 2. Circle, Rectangle, Triangle (concrete classes)
// 3. ShapeCalculator utility class

// Implement:
// - Abstract methods for area and perimeter
// - Method overloading for different parameter types
// - Interface for drawable shapes
```

## Advanced Challenges

### Exercise 9: Data Structure Implementation
Implement basic data structures in Python.

```python
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None
    
    def append(self, data):
        # Implement append method
        pass
    
    def delete(self, data):
        # Implement delete method
        pass
    
    def display(self):
        # Implement display method
        pass

# Test your LinkedList implementation
```

### Exercise 10: Design Pattern Implementation
Implement common design patterns in Java.

```java
// Implement these design patterns:
// 1. Singleton Pattern
// 2. Factory Pattern
// 3. Observer Pattern

// Create practical examples for each pattern
```

## How to Use These Exercises

1. **Start with Python exercises** (1-5) to build confidence
2. **Move to Java OOP exercises** (6-8) to practice object-oriented concepts
3. **Challenge yourself** with advanced exercises (9-10)
4. **Test your solutions** with the provided test cases
5. **Create your own variations** to deepen understanding

## Progress Tracking

Track your completion:
- [ ] Exercise 1: Temperature Converter
- [ ] Exercise 2: List Operations
- [ ] Exercise 3: Dictionary Operations
- [ ] Exercise 4: String Manipulation
- [ ] Exercise 5: Number Operations
- [ ] Exercise 6: Student Management System
- [ ] Exercise 7: Bank Account System
- [ ] Exercise 8: Shape Calculator
- [ ] Exercise 9: Data Structure Implementation
- [ ] Exercise 10: Design Pattern Implementation

## Tips for Success

1. **Read the problem carefully** before starting
2. **Plan your approach** before coding
3. **Test incrementally** as you build your solution
4. **Don't be afraid to refactor** your code
5. **Practice regularly** - consistency is key!

## Next Steps

After completing these exercises:
1. Review any concepts you found challenging
2. Move to Week 2: Python Libraries & Advanced OOP
3. Continue building on your foundation

## Additional Practice: Meta Tech Screen Preparation

For those preparing for technical interviews at Meta or similar companies, we've included a comprehensive set of exercises specifically designed for tech screen preparation. These exercises focus on:

- **Core CS Fundamentals**: Algorithms, data structures, OOP design
- **Interview-Specific Skills**: Big O analysis, optimization, edge case handling
- **Meta-Specific Preparation**: Company values, technology stack familiarity

See `meta_tech_screen_prep.md` for detailed exercises covering:
- Arrays & Strings
- Lists (Linked Lists)
- Stacks & Queues
- Hash & Maps
- Sorting Algorithms
- Trees
- Graphs (BFS & DFS)
- Recursion

**Note**: These exercises are designed to take up to 1 hour each and include pre-work video resources for each topic.
