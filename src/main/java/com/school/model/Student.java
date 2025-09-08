package com.school.model;

/**
 * Student class that extends Person and implements learning/teaching behaviors.
 * Students primarily learn but can also teach in peer-to-peer scenarios.
 */
public class Student extends LearnPerson {
    
    // Constructor - calls parent constructor
    public Student(int id, int age, int experienceLevel) {
        // The 'super' keyword calls the constructor of the parent class (Person)
        // This is not unique to Student; any subclass of Person (like Teacher) can use 'super'
        // It initializes the inherited fields: id, age, and experienceLevel
        super(id, age, experienceLevel);
    }
    
    /**
     * Student-specific age validation: minimum age 18
     */
    @Override
    protected ValidationResult validateAge(int age) {
        if (age < 18) {
            return ValidationResult.failure("Student must be at least 18 years old. Current age: " + age);
        }
        if (age > 120) {
            return ValidationResult.failure("Age cannot exceed 120 years. Current age: " + age);
        }
        return ValidationResult.success();
    }
    
    /**
     * Student-specific experience level validation: minimum 0
     */
    @Override
    protected ValidationResult validateExperienceLevel(int experienceLevel) {
        if (experienceLevel < 0) {
            return ValidationResult.failure("Experience level cannot be negative. Current level: " + experienceLevel);
        }
        return ValidationResult.success();
    }

    /**
     * Student-specific ID validation: must be positive
     */
    @Override
    protected ValidationResult validateId(int id) {
        if (id <= 0) {
            return ValidationResult.failure("Student ID must be positive. Current ID: " + id);
        }
        return ValidationResult.success();
    }
    
    /**
     * Student's learning behavior - listening and taking notes
     */
    @Override
    public void learn(PersonType personType, String topic) {
        System.out.println("Student " + this.getId() + " is learning " + topic + " from " + personType.getClass().getSimpleName());
        System.out.println("Student is listening carefully and taking notes...");
        // Increase experience level when learning
        this.setExperienceLevel(this.getExperienceLevel() + 1);
    }
    
    /**
     * Student's teaching behavior - peer-to-peer teaching
     */
    @Override
    public void teach(PersonType personType, String topic) {
        System.out.println("Student " + this.getId() + " is teaching " + topic + " to " + personType.getClass().getSimpleName());
        System.out.println("Student is explaining concepts and sharing knowledge...");
        // Teaching also increases experience
        this.setExperienceLevel(this.getExperienceLevel() + 1);
    }
    
    /**
     * Student-specific method for studying
     */
    public void study(String subject) {
        System.out.println("Student " + this.getId() + " is studying " + subject);
        System.out.println("Reading books, practicing problems...");
        this.setExperienceLevel(this.getExperienceLevel() + 1);
    }
}