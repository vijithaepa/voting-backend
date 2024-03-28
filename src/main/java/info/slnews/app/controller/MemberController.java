package info.slnews.app.controller;


import info.slnews.app.dto.DTOUtil;
import info.slnews.app.dto.MemberDto;
import info.slnews.app.entity.Organisation;
import info.slnews.app.enums.ActivityCategory;
import info.slnews.app.enums.QualificationStatus;
import info.slnews.app.enums.UserStatus;
import info.slnews.app.service.MemberService;
import info.slnews.app.service.OrganisationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class MemberController {

    private Logger logger = LoggerFactory.getLogger(MemberController.class);

    @Autowired
    private OrganisationService organisationService;

    @Autowired
    private MemberService memberService;

    @PostMapping(path = "/member", consumes="application/json")
    public ResponseEntity<MemberDto> addMember(@RequestBody MemberDto newMember) {
        logger.info("New member details " + newMember);

        return  ResponseEntity.ok(memberService.saveMember(newMember));

    }

    @GetMapping(path = "/member")
    public ResponseEntity<List<MemberDto>> getMembers() {
        logger.info("get all member details ");
        return ResponseEntity.ok(new ArrayList<>());
//        return ResponseEntity.ok(memberService.getMembers());
    }

    @GetMapping(path = "/member/organisations")
    public ResponseEntity<List<Organisation>> getOrgs() {
        return ResponseEntity.ok(organisationService.getAll());
    }

    @GetMapping(path = "/member/config")
    public ResponseEntity<Map<String, Object>> getMemberConfigs() {
        logger.info("Get configs");
        Map<String, Object> configs = new HashMap<>();
        configs.put("organisations", new ArrayList<Organisation>()); // organisationService.getAll()
        configs.put("qualificationStatus", DTOUtil.getConstantMap(QualificationStatus.class));
        configs.put("activityCategories", DTOUtil.getConstantMap(ActivityCategory.class));
        configs.put("userStatus", DTOUtil.getConstantMap(UserStatus.class));
        return ResponseEntity.ok(configs);
    }

}
