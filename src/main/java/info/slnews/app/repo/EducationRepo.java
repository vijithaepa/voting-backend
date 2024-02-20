package info.slnews.app.repo;

import info.slnews.app.entity.Activities;
import info.slnews.app.entity.Education;
import info.slnews.app.entity.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepo extends JpaRepository<Education, Long> {

    List<Education> findByMemberId(Long memberId);

}
