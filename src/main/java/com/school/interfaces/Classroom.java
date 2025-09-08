package com.school.interfaces;

/**
 * Classroom interface defining the contract for teaching and learning behaviors.
 * Implemented by the Person abstract class.
 */
public interface Classroom {
    
    /**
     * Abstract method for teaching behavior.
     * @param personType The person being taught
     * @param topic The topic being taught
     */
    void teach(com.school.model.PersonType personType, String topic);
    
    /**
     * Abstract method for learning behavior.
     * @param personType The person doing the learning
     * @param topic The topic being learned
     */
    void learn(com.school.model.PersonType personType, String topic);
}
