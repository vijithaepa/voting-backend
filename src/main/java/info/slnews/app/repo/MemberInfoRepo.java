package info.slnews.app.repo;

import info.slnews.app.dto.MemberDto;
import info.slnews.app.entity.MemberInfo;
import info.slnews.app.entity.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberInfoRepo extends JpaRepository<MemberInfo, Long> {

    //Long id, String title, String fullName, String address, Instant dateOfBirth, String email,
    //                     String phoneNo, String memberStatus
    @Query("SELECT new info.slnews.app.dto.MemberDto(id,title,name,address,dateOfBirth,email,phoneNo,status) FROM " +
            "MemberInfo")
    List<MemberDto> findAllMemberInfo();
}
