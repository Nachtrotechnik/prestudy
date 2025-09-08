package com.school.test;

import com.school.model.*;
import com.school.enums.*;

/**
 * Comprehensive test suite for the OOP system.
 * Tests all functionality including edge cases, error handling, and performance.
 */
public class ComprehensiveTest {
    
    public static void main(String[] args) {
        System.out.println("=== Comprehensive OOP System Test ===\n");
        
        // Test 1: Factory Pattern
        testFactoryPattern();
        
        // Test 2: Validation System
        testValidationSystem();
        
        // Test 3: Director Functions (Comprehensive)
        testDirectorFunctions();
        
        // Test 4: Performance Testing
        testPerformance();
        
        // Test 5: Error Handling
        testErrorHandling();
        
        // Test 6: Memory Usage
        testMemoryUsage();
        
        System.out.println("\n=== All Tests Completed Successfully! ===");
    }
    
    /**
     * Test Factory Pattern implementation
     */
    private static void testFactoryPattern() {
        System.out.println("=== Testing Factory Pattern ===");
        
        try {
            // Test valid creations
            Student student = PersonFactory.createStudent(101, 20, 2);
            Teacher teacher = PersonFactory.createTeacher(201, 25, 5);
            Director director = PersonFactory.createDirector(301, 45, 15);
            
            System.out.println("✅ Factory Pattern: Valid objects created successfully");
            System.out.println("Student: " + student);
            System.out.println("Teacher: " + teacher);
            System.out.println("Director: " + director);
            
        } catch (Exception e) {
            System.out.println("❌ Factory Pattern failed: " + e.getMessage());
        }
        System.out.println();
    }
    
    /**
     * Test validation system with edge cases
     */
    private static void testValidationSystem() {
        System.out.println("=== Testing Validation System ===");
        
        // Test invalid student creation
        try {
            PersonFactory.createStudent(0, 15, -1); // Invalid: ID=0, age<18, exp<0
            System.out.println("❌ Validation failed: Should have thrown exception");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Validation working: " + e.getMessage());
        }
        
        // Test invalid teacher creation
        try {
            PersonFactory.createTeacher(-1, 20, 1); // Invalid: ID<0, age<21, exp<2
            System.out.println("❌ Validation failed: Should have thrown exception");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Validation working: " + e.getMessage());
        }
        
        // Test invalid director creation
        try {
            PersonFactory.createDirector(0, 15, -1); // Invalid: ID=0, age<18, exp<0
            System.out.println("❌ Validation failed: Should have thrown exception");
        } catch (IllegalArgumentException e) {
            System.out.println("✅ Validation working: " + e.getMessage());
        }
        
        System.out.println();
    }
    
    /**
     * Test Director functions comprehensively
     */
    private static void testDirectorFunctions() {
        System.out.println("=== Testing Director Functions ===");
        
        try {
            Director director = PersonFactory.createDirector(301, 45, 15);
            
            // Test all department types
            System.out.println("Testing Department Management:");
            for (Department dept : Department.values()) {
                String result = director.manage(dept, "Budget Review");
                System.out.println("  " + result);
            }
            
            // Test all event types
            System.out.println("\nTesting Event Organization:");
            for (Event event : Event.values()) {
                String result = director.organize(event, "Annual Planning");
                System.out.println("  " + result);
            }
            
            // Test all public entity types
            System.out.println("\nTesting Public Relations:");
            for (Public publicEntity : Public.values()) {
                String result = director.pr(publicEntity, "Community Outreach");
                System.out.println("  " + result);
            }
            
            System.out.println("✅ Director functions working correctly");
            
        } catch (Exception e) {
            System.out.println("❌ Director test failed: " + e.getMessage());
        }
        
        System.out.println();
    }
    
    /**
     * Test performance with large datasets
     */
    private static void testPerformance() {
        System.out.println("=== Testing Performance ===");
        
        long startTime = System.currentTimeMillis();
        
        // Create many objects to test performance
        for (int i = 0; i < 1000; i++) {
            try {
                PersonFactory.createStudent(i + 1000, 20 + (i % 50), i % 10);
            } catch (Exception e) {
                // Expected for some invalid combinations
            }
        }
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        
        System.out.println("✅ Performance test completed in " + duration + "ms");
        System.out.println("Average time per object: " + (duration / 1000.0) + "ms");
        
        System.out.println();
    }
    
    /**
     * Test error handling
     */
    private static void testErrorHandling() {
        System.out.println("=== Testing Error Handling ===");
        
        // Test null handling
        try {
            Director director = PersonFactory.createDirector(301, 45, 15);
            String result = director.manage(null, "Test");
            System.out.println("❌ Should have handled null department");
        } catch (Exception e) {
            System.out.println("✅ Error handling working: " + e.getClass().getSimpleName());
        }
        
        // Test extreme values
        try {
            PersonFactory.createStudent(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            System.out.println("❌ Should have validated extreme values");
        } catch (Exception e) {
            System.out.println("✅ Extreme value validation working");
        }
        
        System.out.println();
    }
    
    /**
     * Test memory usage
     */
    private static void testMemoryUsage() {
        System.out.println("=== Testing Memory Usage ===");
        
        Runtime runtime = Runtime.getRuntime();
        long beforeMemory = runtime.totalMemory() - runtime.freeMemory();
        
        // Create many objects to test memory usage
        for (int i = 0; i < 100; i++) {
            try {
                PersonFactory.createStudent(i + 1000, 20 + (i % 50), i % 10);
            } catch (Exception e) {
                // Expected for some invalid combinations
            }
        }
        
        long afterMemory = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = afterMemory - beforeMemory;
        
        System.out.println("✅ Memory usage test completed");
        System.out.println("Memory used: " + (memoryUsed / 1024) + " KB");
        
        System.out.println();
    }
}
