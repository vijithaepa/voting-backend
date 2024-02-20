package info.slnews.app.repo;

import info.slnews.app.entity.Activities;
import info.slnews.app.entity.Organisation;
import info.slnews.app.entity.PoliticalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PoliticalHistoryRepo extends JpaRepository<PoliticalHistory, Long> {

    List<PoliticalHistory> findByMemberId(Long memberId);

}
