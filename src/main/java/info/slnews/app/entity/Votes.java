package info.slnews.app.entity;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "votes")
public class Votes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rate", nullable = false)
    private int rate;

    @Column(name = "member_id", nullable = false)
    private Long member_id;

    @Column(name = "user_id", nullable = false)
    private Long user_id;

    @Column(name = "voted_on", nullable = false)
    private Instant votedOn;

    public Votes() {
    }

    public Votes(int rate, Long member_id, Long user_id) {
        this.rate = rate;
        this.member_id = member_id;
        this.user_id = user_id;
        this.votedOn = Instant.now();
    }

    public Long getId() {
        return id;
    }

    public int getRate() {
        return rate;
    }

    public Long getMember_id() {
        return member_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public Instant getVotedOn() {
        return votedOn;
    }
}
