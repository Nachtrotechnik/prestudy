/**
 * Classroom interface defining the contract for teaching and learning behaviors.
 * Implemented by the Person abstract class.
 */
public interface Classroom {
    
    /**
     * Abstract method for teaching behavior.
     * @param person The person being taught
     * @param topic The topic being taught
     */
    void teach(Person person, String topic);
    
    /**
     * Abstract method for learning behavior.
     * @param person The person doing the learning
     * @param topic The topic being learned
     */
    void learn(Person person, String topic);
}
