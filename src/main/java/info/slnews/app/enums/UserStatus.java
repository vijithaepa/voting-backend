package info.slnews.app.enums;

public enum UserStatus {
    ACTIVE("Active"), INACTIVE("Inactive"), DRAFT("Draft");

    private final String description;

    UserStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }

}
