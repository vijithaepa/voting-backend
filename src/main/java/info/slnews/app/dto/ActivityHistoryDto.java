package info.slnews.app.dto;

import info.slnews.app.enums.ActivityCategory;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

//{date=2024-02-19T13:00:00.000Z, description=j kljlkasd kajskldfo8ihwilef, role=boss, category=political}
public class ActivityHistoryDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -2558747749334830446L;
    private Long id;
    private String role;
    private String description;
    private ActivityCategory category;
    private Instant date;

    public ActivityHistoryDto() {
    }

    public ActivityHistoryDto(Long id, String role, String description, ActivityCategory category, Instant date) {
        this.id = id;
        this.role = role;
        this.description = description;
        this.category = category;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ActivityCategory getCategory() {
        return category;
    }

    public void setCategory(ActivityCategory category) {
        this.category = category;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }
}
