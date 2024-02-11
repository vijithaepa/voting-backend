package info.slnews.app.dto;

import java.util.Date;

//{institution=fdsd, qualification=fghj, from=2024-02-13T13:00:00.000Z, to=2024-02-13T13:00:00.000Z, status=active}
public class EducationHistoryDto {

    private String institution;
    private String qualification;
    private Date from;
    private Date to;
    private String status;

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

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
