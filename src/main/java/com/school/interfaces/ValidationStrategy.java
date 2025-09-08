package com.school.interfaces;

import com.school.model.ValidationResult;

/**
 * ValidationStrategy interface for different validation approaches.
 * Allows for better extensibility and different validation strategies.
 */
public interface ValidationStrategy {
    
    /**
     * Validates age based on specific strategy
     * @param age The age to validate
     * @return ValidationResult indicating success or failure
     */
    ValidationResult validateAge(int age);
    
    /**
     * Validates experience level based on specific strategy
     * @param experienceLevel The experience level to validate
     * @return ValidationResult indicating success or failure
     */
    ValidationResult validateExperienceLevel(int experienceLevel);
    
    /**
     * Validates ID based on specific strategy
     * @param id The ID to validate
     * @return ValidationResult indicating success or failure
     */
    ValidationResult validateId(int id);
}
