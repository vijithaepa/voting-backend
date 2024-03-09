package info.slnews.app.dto;

import info.slnews.app.enums.QualificationStatus;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

//{institution=fdsd, qualification=fghj, from=2024-02-13T13:00:00.000Z, to=2024-02-13T13:00:00.000Z, status=active}
public class EducationHistoryDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -4384124890543994008L;

    private Long id;
    private String institution;
    private String qualification;
    private Instant from;
    private Instant to;
    private String description;
    private QualificationStatus status;

    public EducationHistoryDto() {
    }

    public EducationHistoryDto(Long id, String institution, String qualification, Instant from, Instant to,
                               QualificationStatus status, String description) {
        this.id = id;
        this.institution = institution;
        this.qualification = qualification;
        this.from = from;
        this.to = to;
        this.status = status;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Instant getFrom() {
        return from;
    }

    public void setFrom(Instant from) {
        this.from = from;
    }

    public Instant getTo() {
        return to;
    }

    public void setTo(Instant to) {
        this.to = to;
    }

    public QualificationStatus getStatus() {
        return status;
    }

    public void setStatus(QualificationStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }
}
