package info.slnews.app.service;

import info.slnews.app.dto.MemberDto;

import java.util.List;

public interface MemberService {
    MemberDto saveMember(MemberDto memberDto);

    List<MemberDto> getMembers();
}
