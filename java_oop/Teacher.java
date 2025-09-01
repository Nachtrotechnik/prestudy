/**
 * Teacher class that extends Person and implements teaching/learning behaviors.
 * Teachers primarily teach but also continue learning and professional development.
 */
public class Teacher extends Person {
    
    // Constructor - calls parent constructor
    public Teacher(int id, int age, int experienceLevel) {
        super(id, age, experienceLevel);
    }
    
    /**
     * Teacher-specific age validation: minimum age 21
     */
    @Override
    protected ValidationResult validateAge(int age) {
        if (age < 21) {
            return ValidationResult.failure("Teacher must be at least 21 years old. Current age: " + age);
        }
        if (age > 120) {
            return ValidationResult.failure("Age cannot exceed 120 years. Current age: " + age);
        }
        return ValidationResult.success();
    }
    
    /**
     * Teacher-specific experience level validation: minimum 2
     */
    @Override
    protected ValidationResult validateExperienceLevel(int experienceLevel) {
        if (experienceLevel < 2) {
            return ValidationResult.failure("Teacher must have at least 2 years of experience. Current level: " + experienceLevel);
        }
        return ValidationResult.success();
    }
    
    /**
     * Teacher's teaching behavior - conducting lessons
     */
    @Override
    public void teach(Person person, String topic) {
        System.out.println("Teacher " + this.getId() + " is teaching " + topic + " to " + person.getClass().getSimpleName());
        System.out.println("Teacher is explaining concepts, giving examples, and answering questions...");
        // Teaching increases experience
        this.setExperienceLevel(this.getExperienceLevel() + 1);
    }
    
    /**
     * Teacher's learning behavior - professional development
     */
    @Override
    public void learn(Person person, String topic) {
        System.out.println("Teacher " + this.getId() + " is learning " + topic + " from " + person.getClass().getSimpleName());
        System.out.println("Teacher is attending workshops, reading research, and improving skills...");
        // Learning increases experience
        this.setExperienceLevel(this.getExperienceLevel() + 1);
    }
    
    /**
     * Teacher-specific method for lesson planning
     */
    public void planLesson(String subject) {
        System.out.println("Teacher " + this.getId() + " is planning lesson for " + subject);
        System.out.println("Preparing materials, activities, and assessments...");
        this.setExperienceLevel(this.getExperienceLevel() + 1);
    }
}
