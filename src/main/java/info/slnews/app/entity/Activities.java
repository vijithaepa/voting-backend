package info.slnews.app.entity;

import info.slnews.app.enums.ActivityCategory;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "activities")
public class Activities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role", length = 100, nullable = false)
    private String role;

    @Column(name = "description", length = 250)
    private String description;

    @Column(name = "date")
    private Instant date;

    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private ActivityCategory category;

//    @Column(name = "other_category", length = 100)
//    private String otherCategory;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    public Activities() {
    }

    public Activities(Long id, String role, String description, Instant date, ActivityCategory category, Long memberId) {
        this.id = id;
        this.role = role;
        this.description = description;
        this.date = date;
        this.category = category;
        this.memberId = memberId;
    }

    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getDescription() {
        return description;
    }

    public Instant getDate() {
        return date;
    }

    public ActivityCategory getCategory() {
        return category;
    }

    public Long getMemberId() {
        return memberId;
    }
}
