package info.slnews.app.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * Holds Daily (current) average votes per member.
 */

@Entity
@Table(name = "voting-history")
public class VotingHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id", nullable = false)
    private Long member_id;

    @Column(name = "rate", nullable = false)
    private BigDecimal rate;

    @Column(name = "date", nullable = false)
    private Instant date;

}
