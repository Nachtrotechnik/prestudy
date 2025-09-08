package com.school.model;

/**
 * ValidationResult class to encapsulate validation results.
 * Contains a boolean status and an error message.
 */
public class ValidationResult {
    private boolean isValid;
    private String errorMessage;

    // Private constructor
    private ValidationResult(boolean isValid, String errorMessage) {
        this.isValid = isValid;
        this.errorMessage = errorMessage;
    }

    // Getter methods
    public boolean isValid() {
        return isValid;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    // Static factory methods
    public static ValidationResult success() {
        return new ValidationResult(true, null);
    }

    public static ValidationResult failure(String errorMessage) {
        return new ValidationResult(false, errorMessage);
    }
}
