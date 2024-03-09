package info.slnews.app.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "organisation")
public class Organisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "shortName", length = 100)
    private String shortName;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "color", length = 50)
    private String color;

    @Column(name = "owner", length = 100)
    private String owner;

    @Column(name = "link", length = 300)
    private String link;

    @Column(name = "commenceDate")
    private Instant commenceDate;

    public Organisation() {
    }

    public Organisation(Long id, String name, String shortName, String description, String color, String owner,
                        Instant commenceDate, String link) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.description = description;
        this.color = color;
        this.owner = owner;
        this.commenceDate = commenceDate;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public String getShortName() {
        return shortName;
    }

    public String getOwner() {
        return owner;
    }

    public Instant getCommenceDate() {
        return commenceDate;
    }

    public String getLink() {
        return link;
    }
}
