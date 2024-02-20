package info.slnews.app.repo;

import info.slnews.app.entity.Activities;
import info.slnews.app.entity.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepo extends JpaRepository<Activities, Long> {

    List<Activities> findByMemberId(Long memberId);

}
