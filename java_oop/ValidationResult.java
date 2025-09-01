
/**
 * ValidationResult class to hold validation status and error details.
 * This provides a clean way to return validation results from validation methods.
 */
public class ValidationResult {
    
    private boolean isValid;
    private String errorMessage;
    
    // Constructor
    public ValidationResult(boolean isValid, String errorMessage) {
        this.isValid = isValid;
        this.errorMessage = errorMessage;
    }
    
    // Static factory methods for common results
    public static ValidationResult success() {
        return new ValidationResult(true, null);
    }
    
    public static ValidationResult failure(String errorMessage) {
        return new ValidationResult(false, errorMessage);
    }
    
    // Getters
    public boolean isValid() {
        return isValid;
    }
    
    public String getErrorMessage() {
        return errorMessage;
    }
    
    // Override toString for debugging
    @Override
    public String toString() {
        if (isValid) {
            return "ValidationResult{status=SUCCESS}";
        } else {
            return "ValidationResult{status=FAILED, error='" + errorMessage + "'}";
        }
    }
}
