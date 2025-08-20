# Week 1: Java OOP Concepts

## Learning Objectives
- [ ] Refresh core Java OOP concepts (classes, objects, methods)
- [ ] Practice the four pillars of OOP

## 1. Basic Java Structure

### Hello World Program
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Compilation and Execution
```bash
# Compile
javac HelloWorld.java

# Run
java HelloWorld
```

## 2. Classes and Objects

### Class Definition
```java
public class Student {
    // Instance variables (attributes)
    private String name;
    private int age;
    private String studentId;
    
    // Constructor
    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }
    
    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.studentId = "N/A";
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    
    // Instance method
    public void study() {
        System.out.println(name + " is studying.");
    }
    
    // Method with return value
    public String getInfo() {
        return "Student: " + name + ", Age: " + age + ", ID: " + studentId;
    }
}
```

### Creating and Using Objects
```java
public class Main {
    public static void main(String[] args) {
        // Create objects using constructor
        Student student1 = new Student("Alice", 20, "S001");
        Student student2 = new Student("Bob", 22, "S002");
        
        // Create object using default constructor
        Student student3 = new Student();
        student3.setName("Charlie");
        student3.setAge(21);
        
        // Call methods on objects
        student1.study();
        System.out.println(student2.getInfo());
        
        // Access and modify object state
        System.out.println("Before: " + student1.getName());
        student1.setName("Alice Smith");
        System.out.println("After: " + student1.getName());
    }
}
```

## 3. The Four Pillars of OOP

### 1. Encapsulation
```java
public class BankAccount {
    // Private instance variables (data hiding)
    private double balance;
    private String accountNumber;
    private String accountHolder;
    
    // Public methods to access and modify data
    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount");
            return false;
        }
    }
    
    public String getAccountInfo() {
        return "Account: " + accountNumber + 
               ", Holder: " + accountHolder + 
               ", Balance: $" + balance;
    }
}
```

### 2. Inheritance
```java
// Parent class (superclass)
public class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
    
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

// Child class (subclass)
public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
    }
    
    // Override parent method
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
    
    // New method specific to Dog
    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }
    
    public String getBreed() {
        return breed;
    }
}

// Another child class
public class Cat extends Animal {
    private boolean isIndoor;
    
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow!");
    }
    
    public void climb() {
        System.out.println(name + " is climbing.");
    }
}
```

### 3. Polymorphism
```java
public class AnimalTest {
    public static void main(String[] args) {
        // Polymorphism: Animal reference can point to Dog or Cat objects
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Buddy", 3, "Golden Retriever");
        animals[1] = new Cat("Whiskers", 2, true);
        animals[2] = new Dog("Max", 4, "Labrador");
        
        // Same method call, different behavior (runtime polymorphism)
        for (Animal animal : animals) {
            animal.makeSound();  // Calls appropriate makeSound() method
        }
        
        // Method overloading (compile-time polymorphism)
        AnimalHelper helper = new AnimalHelper();
        helper.feed(animals[0]);           // Calls feed(Animal)
        helper.feed((Dog) animals[0]);     // Calls feed(Dog)
        helper.feed((Cat) animals[1]);     // Calls feed(Cat)
    }
}

class AnimalHelper {
    public void feed(Animal animal) {
        System.out.println("Feeding animal: " + animal.name);
        animal.eat();
    }
    
    public void feed(Dog dog) {
        System.out.println("Feeding dog: " + dog.name + " with dog food");
        dog.eat();
    }
    
    public void feed(Cat cat) {
        System.out.println("Feeding cat: " + cat.name + " with cat food");
        cat.eat();
    }
}
```

### 4. Abstraction
```java
// Abstract class
public abstract class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    // Abstract method (must be implemented by subclasses)
    public abstract double calculateArea();
    
    // Abstract method
    public abstract double calculatePerimeter();
    
    // Concrete method
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    // Concrete method
    public void displayInfo() {
        System.out.println("Shape color: " + color);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

// Concrete class implementing abstract class
public class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    public double getRadius() {
        return radius;
    }
}

// Interface (pure abstraction)
public interface Drawable {
    void draw();
    void erase();
    String getDrawingTool();
}

// Class implementing interface
public class Rectangle extends Shape implements Drawable {
    private double width;
    private double height;
    
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return width * height;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    
    // Interface method implementations
    @Override
    public void draw() {
        System.out.println("Drawing rectangle with color: " + color);
    }
    
    @Override
    public void erase() {
        System.out.println("Erasing rectangle");
    }
    
    @Override
    public String getDrawingTool() {
        return "Pencil";
    }
}
```

## 4. Practice Problems

### Problem 1: Create a Library Management System
```java
public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }
    
    // Add getters, setters, and methods
}

public class Library {
    private List<Book> books;
    
    public Library() {
        this.books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public Book findBook(String isbn) {
        // Implement search logic
    }
    
    public boolean borrowBook(String isbn) {
        // Implement borrowing logic
    }
    
    public boolean returnBook(String isbn) {
        // Implement return logic
    }
}
```

### Problem 2: Implement a Calculator with OOP
```java
public abstract class Operation {
    protected double operand1;
    protected double operand2;
    
    public Operation(double operand1, double operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    
    public abstract double calculate();
}

public class Addition extends Operation {
    public Addition(double a, double b) {
        super(a, b);
    }
    
    @Override
    public double calculate() {
        return operand1 + operand2;
    }
}

// Implement other operations: Subtraction, Multiplication, Division
```

## 5. Key Concepts Summary

1. **Class**: Blueprint for creating objects
2. **Object**: Instance of a class with state and behavior
3. **Constructor**: Special method for initializing objects
4. **Method**: Function that operates on object data
5. **Encapsulation**: Bundling data and methods, controlling access
6. **Inheritance**: Creating new classes from existing ones
7. **Polymorphism**: Same interface, different implementations
8. **Abstraction**: Hiding complex implementation details

## 6. Next Steps
1. Practice creating classes and objects
2. Implement the four pillars in your own examples
3. Complete the practice problems
4. Move to Python OOP when ready

## Resources
- [Java Documentation](https://docs.oracle.com/javase/tutorial/)
- [Java OOP Tutorial](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Baeldung Java Tutorials](https://www.baeldung.com/java-tutorial)
