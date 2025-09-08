public interface Office {
    String manage(Department department, String action);
    String organize(Event event, String details);
    String pr(Public publicEntity, String contact);
}
