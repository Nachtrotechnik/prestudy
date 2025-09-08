package com.school.model;

import com.school.interfaces.Classroom;

/**
 * Abstract Person class that implements the Classroom interface.
 * Serves as the base class for Student and Teacher.
 */
public abstract class LearnPerson extends PersonType implements Classroom {

    // Constructor - calls parent constructor
    public LearnPerson(int id, int age, int experienceLevel) {
        super(id, age, experienceLevel);
    }
    // Abstract methods from Classroom interface
    // These must be implemented by concresses
    public abstract void teach(PersonType personType, String topic);
    public abstract void learn(PersonType personType, String topic);   
}
