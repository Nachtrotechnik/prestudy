/**
 * Abstract Person class that implements the Classroom interface.
 * Serves as the base class for Student and Teacher.
 */
public abstract class Person implements Classroom {
    
    // Private properties with encapsulation
    private int id;
    private int age;
    private int experienceLevel;
    
    // Constructor to initialize properties
    public Person(int id, int age, int experienceLevel) {
        this.id = id;
        this.age = age;
        this.experienceLevel = experienceLevel;
    }
    
    // Getter methods for accessing private properties
    public int getId() {
        return id;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getExperienceLevel() {
        return experienceLevel;
    }
    
    // Setter methods with validation
    public boolean setAge(int age) {
        ValidationResult result = validateAge(age);
        if (result.isValid()) {
            this.age = age;
            return true;
        } else {
            System.out.println("❌ Age validation failed: " + result.getErrorMessage());
            return false;
        }
    }
    
    public boolean setExperienceLevel(int experienceLevel) {
        ValidationResult result = validateExperienceLevel(experienceLevel);
        if (result.isValid()) {
            this.experienceLevel = experienceLevel;
            return true;
        } else {
            System.out.println("❌ Experience level validation failed: " + result.getErrorMessage());
            return false;
        }
    }
    
    // Abstract validation methods - must be implemented by subclasses
    protected abstract ValidationResult validateAge(int age);
    protected abstract ValidationResult validateExperienceLevel(int experienceLevel);
    
    // Abstract methods from Classroom interface
    // These must be implemented by concrete subclasses
    public abstract void teach(Person person, String topic);
    public abstract void learn(Person person, String topic);
    
    // Override toString method for better object representation
    @Override
    public String toString() {
        return "Person{id=" + id + ", age=" + age + ", experienceLevel=" + experienceLevel + "}";
    }
}
