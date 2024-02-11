package info.slnews.app.dto;

import java.util.Date;

//{start=2024-02-20T13:00:00.000Z, noOfYears=4, role=3sdfsdf, org=slp}]
public class PoliticalHistoryDto {

    private String role;
    private String org;
    private Date start;
    private int noOfYears;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public int getNoOfYears() {
        return noOfYears;
    }

    public void setNoOfYears(int noOfYears) {
        this.noOfYears = noOfYears;
    }
}
