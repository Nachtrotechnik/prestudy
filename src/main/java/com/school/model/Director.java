package com.school.model;

import com.school.enums.Department;
import com.school.enums.Event;
import com.school.enums.Public;

public class Director extends AdminPerson {

    // Constructor - calls parent constructor
    public Director(int id, int age, int experienceLevel) {
        // The 'super' keyword calls the constructor of the parent class (AdminPerson)
        // This initializes the inherited fields: id, age, and experienceLevel for Director
        super(id, age, experienceLevel);
    }

    @Override
    protected ValidationResult validateAge(int age) {
        if (age < 18) {
            return ValidationResult.failure("Director must be at least 18 years old. Current age: " + age);
        }
        if (age > 120) {
            return ValidationResult.failure("Age cannot exceed 120 years. Current age: " + age);
        }
        return ValidationResult.success();
    }

    @Override
    protected ValidationResult validateExperienceLevel(int experienceLevel) {
        if (experienceLevel < 0) {
            return ValidationResult.failure("Experience level cannot be negative. Current level: " + experienceLevel);
        }
        return ValidationResult.success();
    }

    @Override
    protected ValidationResult validateId(int id) {
        if (id <= 0) {
            return ValidationResult.failure("Director ID must be positive. Current ID: " + id);
        }
        return ValidationResult.success();
    }

    @Override
    public String manage(Department department, String action) {
        return "Director managed department: " + department.getDescription() + " with action: " + action + "?";
    }

    @Override
    public String organize(Event event, String details) {
        return "Director organized event: " + event.getDescription() + " with details: " +details + "?";
    }

    @Override
    public String pr(Public publicEntity, String contact) {
        return "Director handled PR for: " + publicEntity.getDescription() + " with contact: " + contact + "?";    
    }
}