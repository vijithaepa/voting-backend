package info.slnews.app.controller;


import info.slnews.app.dto.MemberDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping
public class MemberController {

    private Logger logger = LoggerFactory.getLogger(MemberController.class);

    @PostMapping(path = "/member", consumes="application/json")
    public ResponseEntity<Map<String, Object>> addMember(@RequestBody MemberDto newMember) {
        logger.info("New member details " + newMember);
        String s = "{title=mr, fullName=vijitha epa, address=, dateOfBirth=, email=, phoneNo=, memberStatus=active, " +
                "political=[{start=2024-02-20T13:00:00.000Z, noOfYears=4, role=3sdfsdf, org=slp}], education=[{institution=fdsd, qualification=fghj, from=2024-02-13T13:00:00.000Z, to=2024-02-13T13:00:00.000Z, status=active}], activities=[{date=2024-02-19T13:00:00.000Z, description=j kljlkasd kajskldfo8ihwilef, role=boss, category=political}]}\n";

        return null;
    }

    @GetMapping(path = "/member")
    public ResponseEntity<Map<String, Object>> getMembers() {

        return null;
    }

}
