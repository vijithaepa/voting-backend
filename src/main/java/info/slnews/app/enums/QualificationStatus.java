package info.slnews.app.enums;

public enum QualificationStatus {
    COMPLETED("Completed"), IM_PROGRESS("In Progress"), FAILED("Failed"), SUSPENDED("Suspended");

    private final String description;

    QualificationStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
