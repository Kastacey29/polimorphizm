public enum Capacity {
    ESPECIALLY_SMALL("до 10 мест"),
    SMALL("до 25 мест"),
    MIDDLE("40-50 мест"),
    BIG("60-80 мест"),
    ESPECIALLY_BIG("100-120 мест");

    private final String description;

    Capacity(String description) {
        if (description == null || description.isEmpty()) {
            this.description = "Данные не указаны";
        } else {
            this.description = description;
        }
    }

    public String getDescription() {
        return description;
    }
}
