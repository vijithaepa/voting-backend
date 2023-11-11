package info.slnews.app.entity;

import info.slnews.app.enums.QualificationStatus;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "qualification", length = 100, nullable = false)
    private String qualification;

    @Column(name = "institution", length = 100, nullable = false)
    private String institution;

    @Column(name = "commencedOn")
    private Instant commencedOn;

    @Column(name = "status", length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private QualificationStatus status;

    @Column(name = "description", length = 250)
    private String description;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    public Education() {
    }

    public Education(String qualification, String institution, Instant commencedOn, QualificationStatus status,
                     String description) {
        this.qualification = qualification;
        this.institution = institution;
        this.commencedOn = commencedOn;
        this.status = status;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getQualification() {
        return qualification;
    }

    public String getInstitution() {
        return institution;
    }

    public Instant getCommencedOn() {
        return commencedOn;
    }

    public QualificationStatus getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
