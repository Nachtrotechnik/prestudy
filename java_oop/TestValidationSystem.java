/**
 * Test class to demonstrate the enhanced OOP validation system:
 * ValidationResult -> Person abstract class -> Student/Teacher concrete classes
 */
public class TestValidationSystem {
    
    public static void main(String[] args) {
        System.out.println("=== Testing Enhanced OOP Validation System ===\n");
        
        // Test 1: Valid Student creation
        System.out.println("=== Test 1: Valid Student Creation ===");
        Student student = new Student(101, 20, 1);
        System.out.println("✅ Student created successfully: " + student);
        System.out.println();
        
        // Test 2: Invalid Student creation (too young)
        System.out.println("=== Test 2: Invalid Student Creation (Too Young) ===");
        try {
            Student youngStudent = new Student(102, 16, 0);
            System.out.println("❌ This should not print - student too young");
        } catch (Exception e) {
            System.out.println("✅ Caught expected error: " + e.getMessage());
        }
        System.out.println();
        
        // Test 3: Valid Teacher creation
        System.out.println("=== Test 3: Valid Teacher Creation ===");
        Teacher teacher = new Teacher(201, 25, 3);
        System.out.println("✅ Teacher created successfully: " + teacher);
        System.out.println();
        
        // Test 4: Invalid Teacher creation (insufficient experience)
        System.out.println("=== Test 4: Invalid Teacher Creation (Insufficient Experience) ===");
        try {
            Teacher newTeacher = new Teacher(202, 22, 1);
            System.out.println("❌ This should not print - teacher lacks experience");
        } catch (Exception e) {
            System.out.println("✅ Caught expected error: " + e.getMessage());
        }
        System.out.println();
        
        // Test 5: Runtime validation testing
        System.out.println("=== Test 5: Runtime Validation Testing ===");
        
        // Try to set invalid age for student
        System.out.println("Attempting to set student age to 17:");
        boolean ageResult = student.setAge(17);
        System.out.println("Age update result: " + ageResult);
        System.out.println("Current student age: " + student.getAge());
        System.out.println();
        
        // Try to set valid age for student
        System.out.println("Attempting to set student age to 22:");
        boolean validAgeResult = student.setAge(22);
        System.out.println("Age update result: " + validAgeResult);
        System.out.println("Current student age: " + student.getAge());
        System.out.println();
        
        // Try to set invalid experience for teacher
        System.out.println("Attempting to set teacher experience to 1:");
        boolean expResult = teacher.setExperienceLevel(1);
        System.out.println("Experience update result: " + expResult);
        System.out.println("Current teacher experience: " + teacher.getExperienceLevel());
        System.out.println();
        
        // Test 6: Normal OOP behavior
        System.out.println("=== Test 6: Normal OOP Behavior ===");
        student.learn(teacher, "Advanced Java");
        System.out.println();
        
        teacher.teach(student, "Design Patterns");
        System.out.println();
        
        student.study("Data Structures");
        System.out.println();
        
        teacher.planLesson("Algorithms");
        System.out.println();
        
        // Show final states
        System.out.println("=== Final States ===");
        System.out.println("Student: " + student);
        System.out.println("Teacher: " + teacher);
        
        System.out.println("\n=== Enhanced OOP Validation System Test Complete! ===");
    }
}
