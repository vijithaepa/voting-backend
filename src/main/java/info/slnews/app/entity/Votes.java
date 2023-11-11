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
    private Long memberId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "voted_on", nullable = false)
    private Instant votedOn;

    public Votes() {
    }

    public Votes(int rate, Long memberId, Long userId) {
        this.rate = rate;
        this.memberId = memberId;
        this.userId = userId;
        this.votedOn = Instant.now();
    }

    public Long getId() {
        return id;
    }

    public int getRate() {
        return rate;
    }

    public Long getMemberId() {
        return memberId;
    }

    public Long getUserId() {
        return userId;
    }

    public Instant getVotedOn() {
        return votedOn;
    }
}
