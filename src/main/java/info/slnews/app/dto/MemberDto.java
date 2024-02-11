package info.slnews.app.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

//{title=mr, fullName=vijitha epa, address=, dateOfBirth=, email=, phoneNo=, memberStatus=active,
// political=[{start=2024-02-20T13:00:00.000Z, noOfYears=4, role=3sdfsdf, org=slp}],
// education=[{institution=fdsd, qualification=fghj, from=2024-02-13T13:00:00.000Z, to=2024-02-13T13:00:00.000Z, status=active}],
// activities=[{date=2024-02-19T13:00:00.000Z, description=j kljlkasd kajskldfo8ihwilef, role=boss, category=political}]}

public class MemberDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 8893986844375457701L;

    private String title;
    private String fullName;
    private String address;
    private Date dateOfBirth;
    private String email;
    private String phoneNo;
    private String memberStatus;

    private List<PoliticalHistoryDto> political;
    private List<EducationHistoryDto> education;
    private List<ActivityHistoryDto> activities;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    public List<PoliticalHistoryDto> getPolitical() {
        return political;
    }

    public void setPolitical(List<PoliticalHistoryDto> political) {
        this.political = political;
    }

    public List<EducationHistoryDto> getEducation() {
        return education;
    }

    public void setEducation(List<EducationHistoryDto> education) {
        this.education = education;
    }

    public List<ActivityHistoryDto> getActivities() {
        return activities;
    }

    public void setActivities(List<ActivityHistoryDto> activities) {
        this.activities = activities;
    }
}
