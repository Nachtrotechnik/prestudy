/**
 * Test class to demonstrate the OOP architecture:
 * Classroom interface -> Person abstract class -> Student/Teacher concrete classes
 */
public class TestOOP {
    
    public static void main(String[] args) {
        System.out.println("=== Testing OOP Architecture ===\n");
        
        // Create a Student and Teacher
        Student student = new Student(101, -21, 3);
        Teacher teacher = new Teacher(201, 35, -2);
        
        System.out.println("Created objects:");
        System.out.println("Student: " + student);
        System.out.println("Teacher: " + teacher);
        System.out.println();
        
        // Test learning behavior
        System.out.println("=== Testing Learning Behavior ===");
        student.learn(teacher, "Java Programming");
        System.out.println();
        
        // Test teaching behavior
        System.out.println("=== Testing Teaching Behavior ===");
        teacher.teach(student, "Object-Oriented Programming");
        System.out.println();
        
        // Test peer-to-peer learning
        System.out.println("=== Testing Peer-to-Peer Learning ===");
        Student student2 = new Student(102, 22, 2);
        student.teach(student2, "Study Tips");
        System.out.println();
        
        // Test teacher learning (professional development)
        System.out.println("=== Testing Teacher Learning ===");
        Teacher mentor = new Teacher(202, 45, 10);
        teacher.learn(mentor, "Advanced Teaching Methods");
        System.out.println();
        
        // Test specific methods
        System.out.println("=== Testing Specific Methods ===");
        student.study("Data Structures");
        teacher.planLesson("Algorithms");
        System.out.println();
        
        // Show final states
        System.out.println("=== Final States ===");
        System.out.println("Student experience: " + student.getExperienceLevel());
        System.out.println("Teacher experience: " + teacher.getExperienceLevel());
        
        System.out.println("\n=== OOP Architecture Test Complete! ===");
    }
}
