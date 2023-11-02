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

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "color", length = 50)
    private String color;

    @Column(name = "owner", length = 100)
    private String owner;

    @Column(name = "commenceDate")
    private Instant commenceDate;

    public Organisation() {
    }

    public Organisation(String name, String description, String color, String owner, Instant commenceDate) {
        this.name = name;
        this.description = description;
        this.color = color;
        this.owner = owner;
        this.commenceDate = commenceDate;
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

    public String getOwner() {
        return owner;
    }

    public Instant getCommenceDate() {
        return commenceDate;
    }
}
