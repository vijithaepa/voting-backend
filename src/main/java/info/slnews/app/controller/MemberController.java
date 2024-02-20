package info.slnews.app.controller;


import info.slnews.app.dto.MemberDto;
import info.slnews.app.service.MemberService;
import info.slnews.app.service.OrganisationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Map<String, Object>> addMember(@RequestBody MemberDto newMember) {
        logger.info("New member details " + newMember);
        return null;
    }

    @GetMapping(path = "/member")
    public ResponseEntity<List<MemberDto>> getMembers() {

        return ResponseEntity.ok(memberService.getMembers());
    }

    @GetMapping(path = "/member/config")
    public ResponseEntity<Map<String, Object>> getMemberConfigs() {
        Map<String, Object> configs = new HashMap<>();
        configs.put("organasations", organisationService.getAll());
        return ResponseEntity.ok(configs);
    }


}
