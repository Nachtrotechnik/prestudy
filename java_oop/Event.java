public enum Event {
    MEETING("Meeting Event"),
    CONFERENCE("Conference Event"),
    WORKSHOP("Workshop Event"),
    CEREMONY("Ceremony Event");

    private String details;

    Event(String details) {
        this.details = details;
    }

    public String getDescription() {
        return details;
    }
}