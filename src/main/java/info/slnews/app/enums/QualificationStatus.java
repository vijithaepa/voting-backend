package info.slnews.app.enums;

public enum QualificationStatus {
    COMPLETED("Completed"), IM_PROGRESS("In Progress"), FAILED("Failed"), SUSPENDED("Suspended");

    QualificationStatus(String description) {
        this.description = description;
    }

    private final String description;

    public String getDescription() {
        return description;
    }

}
