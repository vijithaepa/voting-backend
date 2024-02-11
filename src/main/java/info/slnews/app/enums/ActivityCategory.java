package info.slnews.app.enums;

public enum ActivityCategory {
    SOCIAL_SERVICE("Social Service"), CHARITY_EVENT("Charity Event"), COMMUNITY_EVENT("Community Event"),
    POLITICAL_EVENT("Political Event"), OTHER("Other");

    private final String description;

    ActivityCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
