package info.slnews.app.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

//{start=2024-02-20T13:00:00.000Z, noOfYears=4, role=3sdfsdf, org=slp}]
public class PoliticalHistoryDto implements Serializable {

    @Serial
    private static final long serialVersionUID = 7409178502422306937L;

    private Long id;
    private String role;
    private String org;
    private Instant start;
    private int noOfYears;

    public PoliticalHistoryDto() {
    }

    public PoliticalHistoryDto(Long id, String role, String org, Instant start, int noOfYears) {
        this.id = id;
        this.role = role;
        this.org = org;
        this.start = start;
        this.noOfYears = noOfYears;
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

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public int getNoOfYears() {
        return noOfYears;
    }

    public void setNoOfYears(int noOfYears) {
        this.noOfYears = noOfYears;
    }
}
