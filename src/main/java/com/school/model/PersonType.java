package com.school.model;

public abstract class PersonType {

    private final int id;
    private int age;
    private int experienceLevel;

    // consturctor
    public PersonType(int id, int age, int experienceLevel) {
        this.id = id;
        this.age = age;
        this.experienceLevel = experienceLevel;
    }

    //getters
    public int getId() { return id; }
    public int getAge() { return age;}
    public int getExperienceLevel() { return experienceLevel; }

    //setters
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

    //validators
    protected abstract ValidationResult validateAge(int age); 
    protected abstract ValidationResult validateId(int id); 
    protected abstract ValidationResult validateExperienceLevel(int experienceLevel);

    @Override
    public String toString() {
        return "Person{id=" + getId() + " , age= " + getAge() + " , experienceLevel= " + getExperienceLevel() + "}";
    }
}