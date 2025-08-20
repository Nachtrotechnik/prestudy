# 🐍 Today's Python Study Guide - Day 1

## 🎯 **Today's Learning Objectives**
- [x] Set up your Python development environment
- [x] Write your first Python program
- [x] Understand basic syntax and data types
- [ ] Complete 3 practical exercises

---

## ⏰ **Study Session Breakdown (2-3 hours total)**

### **Session 1: Environment Setup (30 minutes)**
**Time: 8:00 AM - 8:30 AM**

#### **What to do:**
1. **Verify Python installation** ✅ (Already done - Python 3.13.7)
2. **Set up VS Code** (if not already done)
3. **Create your first project folder**
4. **Test your setup**

#### **Commands to run:**
```bash
# Create your Python project folder
mkdir ~/python_learning
cd ~/python_learning

# Create your first Python file
touch hello_world.py
```

---

### **Session 2: Your First Python Program (45 minutes)**
**Time: 8:30 AM - 9:15 AM**

#### **Exercise 1: Hello World Program**
Create `hello_world.py`:

```python
# This is your first Python program!
print("Hello, World!")
print("Welcome to Python learning!")

# Variables and basic data types
name = "Student"
age = 25
is_learning = True

print(f"My name is {name}")
print(f"I am {age} years old")
print(f"Am I learning Python? {is_learning}")

# Check data types
print(f"Type of name: {type(name)}")
print(f"Type of age: {type(age)}")
print(f"Type of is_learning: {type(is_learning)}")
```

#### **Run your program:**
```bash
python3 hello_world.py
```

---

### **Session 3: Basic Syntax & Data Types (45 minutes)**
**Time: 9:15 AM - 10:00 AM**

#### **Exercise 2: Calculator Program**
Create `calculator.py`:

```python
# Simple calculator program
print("=== Simple Calculator ===")

# Get user input
num1 = float(input("Enter first number: "))
num2 = float(input("Enter second number: "))

# Perform calculations
addition = num1 + num2
subtraction = num1 - num2
multiplication = num1 * num2
division = num1 / num2 if num2 != 0 else "Error: Division by zero"

# Display results
print(f"\nResults:")
print(f"{num1} + {num2} = {addition}")
print(f"{num1} - {num2} = {subtraction}")
print(f"{num1} × {num2} = {multiplication}")
print(f"{num1} ÷ {num2} = {division}")
```

---

### **Session 4: Control Flow & Loops (45 minutes)**
**Time: 10:00 AM - 10:45 AM**

#### **Exercise 3: Number Guessing Game**
Create `guessing_game.py`:

```python
import random

print("=== Number Guessing Game ===")
print("I'm thinking of a number between 1 and 100")

# Generate random number
secret_number = random.randint(1, 100)
attempts = 0
max_attempts = 10

while attempts < max_attempts:
    # Get user guess
    try:
        guess = int(input(f"\nEnter your guess (attempt {attempts + 1}/{max_attempts}): "))
        attempts += 1
        
        # Check guess
        if guess < secret_number:
            print("Too low! Try a higher number.")
        elif guess > secret_number:
            print("Too high! Try a lower number.")
        else:
            print(f"\n🎉 Congratulations! You guessed it in {attempts} attempts!")
            break
            
        # Show remaining attempts
        print(f"Attempts remaining: {max_attempts - attempts}")
        
    except ValueError:
        print("Please enter a valid number!")
        continue

if attempts >= max_attempts:
    print(f"\n😔 Game Over! The number was {secret_number}")
```

---

## 📚 **What You'll Learn Today**

### **Core Concepts:**
1. **Print statements** - Output to console
2. **Variables** - Storing data
3. **Data types** - int, float, str, bool
4. **User input** - Getting data from user
5. **Type conversion** - Converting between types
6. **Conditional statements** - if/else logic
7. **Loops** - while loops and control flow
8. **Error handling** - Basic try/except

### **Python Best Practices:**
- Use descriptive variable names
- Add comments to explain your code
- Handle user input errors gracefully
- Use f-strings for formatted output

---

## 🎯 **Success Checklist for Today**

### **By the end of today, you should be able to:**
- [ ] Run Python programs from terminal
- [ ] Create and modify Python files
- [ ] Use basic data types and variables
- [ ] Get user input and process it
- [ ] Write simple conditional logic
- [ ] Create basic loops
- [ ] Handle simple errors

---

## 🚀 **Next Steps After Today**

### **Tomorrow's Focus:**
- Functions and code organization
- Lists and data structures
- More complex control flow
- File handling basics

### **This Week's Goal:**
- Complete 5-7 mini projects
- Understand Python fundamentals
- Be comfortable with basic syntax
- Ready for intermediate concepts

---

## 💡 **Study Tips for Today**

1. **Code along**: Don't just read - type every line
2. **Experiment**: Change values and see what happens
3. **Break it**: Try to break your code and fix it
4. **Ask questions**: Note anything unclear for tomorrow
5. **Take breaks**: 5-minute break every 45 minutes

---

## 🔧 **If You Get Stuck**

### **Common Issues & Solutions:**
- **"Command not found"**: Make sure you're in the right directory
- **Syntax errors**: Check for missing colons, parentheses, or quotes
- **Indentation errors**: Use consistent spacing (4 spaces recommended)
- **Import errors**: Make sure you're using Python 3

### **Resources for Help:**
- Python official docs: https://docs.python.org/3/
- Stack Overflow: https://stackoverflow.com/
- Python Discord: https://discord.gg/python

---

## 🎉 **Ready to Start?**

**Your Python journey begins now!** 

Start with Session 1 and work through each exercise. Remember: every expert was once a beginner. Take your time, experiment, and most importantly - have fun coding! 

**Let's make today count! 🐍✨**

---

*Session time: 2-3 hours total*
*Difficulty: Beginner-friendly*
*Next review: Tomorrow morning*
