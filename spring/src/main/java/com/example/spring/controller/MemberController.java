package com.example.spring.controller;

import com.example.spring.domain.Member;
import com.example.spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MemberController {

    private final MemberService memberService;
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/Member/{id}")
    public Optional<Member> getMember(@PathVariable("id") Long id) {
        return memberService.findOne(id);
    }

    @GetMapping("/Member/all")
    public List<Member> getAllMember() {
        return memberService.findMembers();
    }

    @PostMapping("/Member/new/{name}")
    public void putMember(@PathVariable("name") String name) {
        Member member = new Member();
        member.setName(name);

        memberService.join(member);
    }

    @DeleteMapping("/Member/{id}")
    public void deleteMember(@PathVariable("id") Long id) { memberService.removeOne(id); }


}
