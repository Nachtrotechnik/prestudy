public enum Department {
    ACADEMIC("Academic Department"),
    ADMINISTRATIVE("Administrative Department"),
    SUPPORT("Support Department");

    private String action;

    Department(String action) {
        this.action = action;
    }

    public String getDescription() {
        return action;
    }
}