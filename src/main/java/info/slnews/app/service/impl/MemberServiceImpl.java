package info.slnews.app.service.impl;

import info.slnews.app.dto.MemberDto;
import info.slnews.app.entity.Activities;
import info.slnews.app.entity.Education;
import info.slnews.app.entity.MemberInfo;
import info.slnews.app.entity.PoliticalHistory;
import info.slnews.app.repo.ActivityRepo;
import info.slnews.app.repo.EducationRepo;
import info.slnews.app.repo.MemberInfoRepo;
import info.slnews.app.repo.PoliticalHistoryRepo;
import info.slnews.app.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    private Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);

    @Autowired
    private ActivityRepo activityRepo;

    @Autowired
    private EducationRepo educationRepo;

    @Autowired
    private MemberInfoRepo memberInfoRepo;

    @Autowired
    private PoliticalHistoryRepo politicalHistoryRepo;

    @Override
    public MemberDto saveMember(MemberDto memberDto) {

        return null;
    }

    @Override
    public List<MemberDto> getMembers() {
        List<MemberDto> dtos = new ArrayList<>();
        List<MemberDto> infoList = memberInfoRepo.findAllMemberInfo();
//        for(MemberInfo info: infoList) {
//            List<Activities> activities = activityRepo.findByMemberId(info.getId());
//            List<Education> educations = educationRepo.findByMemberId(info.getId());
//            List<PoliticalHistory> politicalHistories = politicalHistoryRepo.findByMemberId(info.getId());
//
//            dtos.add(getDto(info, activities, educations, politicalHistories));
//        }

        return infoList;
    }


}
