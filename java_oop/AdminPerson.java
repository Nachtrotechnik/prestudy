
public abstract class AdminPerson extends PersonType implements Office {

    // Constructor - calls parent constructor
    public AdminPerson(int id, int age, int experienceLevel) {
        super(id, age, experienceLevel);
    }

    // Abstract methods from Office interface
    // These must be implemented by concresses
    public abstract String manage(Department department, String action);

    public abstract String organize(Event event, String details);

    public abstract String pr(Public publicEntity, String contact);
}
