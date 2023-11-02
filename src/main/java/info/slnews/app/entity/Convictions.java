package info.slnews.app.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "convictions")
public class Convictions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", length = 250)
    private String description;

    @Column(name = "publishedDate")
    private Instant publishedDate;

    @Column(name = "incidentDate")
    private Instant incidentDate;

    @Column(name = "source", length = 100)
    private String source;

    @Column(name = "credibility")
    private int credibility;

    public Convictions() {
    }

    public Convictions(String description, Instant publishedDate, Instant incidentDate, String source, int credibility) {
        this.description = description;
        this.publishedDate = publishedDate;
        this.incidentDate = incidentDate;
        this.source = source;
        this.credibility = credibility;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Instant getPublishedDate() {
        return publishedDate;
    }

    public Instant getIncidentDate() {
        return incidentDate;
    }

    public String getSource() {
        return source;
    }

    public int getCredibility() {
        return credibility;
    }
}
