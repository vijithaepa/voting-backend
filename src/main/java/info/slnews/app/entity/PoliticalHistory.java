package info.slnews.app.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "political_history")
public class PoliticalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role", length = 100)
    private String role;

    @Column(name = "commenceDate", nullable = false)
    private Instant commenceDate;

    @Column(name = "noOfYears", nullable = false)
    private int noOfYears;

    @OneToOne
    @JoinColumn(name = "org_id", referencedColumnName = "id")
    private Organisation organisation;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    public PoliticalHistory() {
    }

    public PoliticalHistory(String role, Instant commenceDate, int noOfYears) {
        this.role = role;
        this.commenceDate = commenceDate;
        this.noOfYears = noOfYears;
    }

    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public Instant getCommenceDate() {
        return commenceDate;
    }

    public int getNoOfYears() {
        return noOfYears;
    }

    public Organisation getOrganisation() {
        return organisation;
    }

    public void setOrganisation(Organisation organisation) {
        this.organisation = organisation;
    }
}
