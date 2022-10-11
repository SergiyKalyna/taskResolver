public enum EventType {
    ENTER("ENTER"),
    SERVED("SERVED");

    private String value;

    EventType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
