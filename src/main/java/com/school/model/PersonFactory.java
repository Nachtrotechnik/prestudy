package com.school.model;

/**
 * PersonFactory class for creating different person types.
 * Implements Factory Pattern for better abstraction and extensibility.
 */
public class PersonFactory {
    
    /**
     * Creates a Student with validation
     * @param id Student ID
     * @param age Student age
     * @param experienceLevel Student experience level
     * @return New Student instance
     * @throws IllegalArgumentException if validation fails
     */
    public static Student createStudent(int id, int age, int experienceLevel) {
        Student student = new Student(id, age, experienceLevel);
        
        // Validate all fields
        ValidationResult idResult = student.validateId(id);
        if (!idResult.isValid()) {
            throw new IllegalArgumentException("Invalid Student ID: " + idResult.getErrorMessage());
        }
        
        ValidationResult ageResult = student.validateAge(age);
        if (!ageResult.isValid()) {
            throw new IllegalArgumentException("Invalid Student Age: " + ageResult.getErrorMessage());
        }
        
        ValidationResult expResult = student.validateExperienceLevel(experienceLevel);
        if (!expResult.isValid()) {
            throw new IllegalArgumentException("Invalid Student Experience: " + expResult.getErrorMessage());
        }
        
        return student;
    }
    
    /**
     * Creates a Teacher with validation
     * @param id Teacher ID
     * @param age Teacher age
     * @param experienceLevel Teacher experience level
     * @return New Teacher instance
     * @throws IllegalArgumentException if validation fails
     */
    public static Teacher createTeacher(int id, int age, int experienceLevel) {
        Teacher teacher = new Teacher(id, age, experienceLevel);
        
        // Validate all fields
        ValidationResult idResult = teacher.validateId(id);
        if (!idResult.isValid()) {
            throw new IllegalArgumentException("Invalid Teacher ID: " + idResult.getErrorMessage());
        }
        
        ValidationResult ageResult = teacher.validateAge(age);
        if (!ageResult.isValid()) {
            throw new IllegalArgumentException("Invalid Teacher Age: " + ageResult.getErrorMessage());
        }
        
        ValidationResult expResult = teacher.validateExperienceLevel(experienceLevel);
        if (!expResult.isValid()) {
            throw new IllegalArgumentException("Invalid Teacher Experience: " + expResult.getErrorMessage());
        }
        
        return teacher;
    }
    
    /**
     * Creates a Director with validation
     * @param id Director ID
     * @param age Director age
     * @param experienceLevel Director experience level
     * @return New Director instance
     * @throws IllegalArgumentException if validation fails
     */
    public static Director createDirector(int id, int age, int experienceLevel) {
        Director director = new Director(id, age, experienceLevel);
        
        // Validate all fields
        ValidationResult idResult = director.validateId(id);
        if (!idResult.isValid()) {
            throw new IllegalArgumentException("Invalid Director ID: " + idResult.getErrorMessage());
        }
        
        ValidationResult ageResult = director.validateAge(age);
        if (!idResult.isValid()) {
            throw new IllegalArgumentException("Invalid Director Age: " + ageResult.getErrorMessage());
        }
        
        ValidationResult expResult = director.validateExperienceLevel(experienceLevel);
        if (!expResult.isValid()) {
            throw new IllegalArgumentException("Invalid Director Experience: " + expResult.getErrorMessage());
        }
        
        return director;
    }
}
