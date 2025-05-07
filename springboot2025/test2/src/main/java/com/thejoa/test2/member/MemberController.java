package com.thejoa.test2.member;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	@Autowired MemberService service;
	

    @GetMapping("/")
    public String main() {
        return "member/login";
    }

    @GetMapping("/member/member")
    public String member() {
        return "member/member";
    }

    @GetMapping("/member/login")
    public String login() {
        return "member/login";
    }

    @GetMapping("/member/join")
    public String join(MemberForm memberForm) {
        return "member/join";
    }

    @PostMapping("/member/join")
    public String join(@Valid MemberForm memberForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "member/join";
        }
        if (!memberForm.getPassword().equals(memberForm.getPassword2())) {
            bindingResult.rejectValue("password2", "passwordIncorrect", "패스워드를 확인해주세요");
            return "member/join";
        }

        try {
            Member member = new Member();
            member.setUsername(memberForm.getUsername());
            member.setEmail(memberForm.getEmail());
            member.setPassword(memberForm.getPassword());
            service.insertMember(member);
        } catch (DataIntegrityViolationException e) {
            e.printStackTrace();
            bindingResult.reject("failed", "등록된 유저입니다.");
            return "member/join";
        } catch (Exception e) {
            e.printStackTrace();
            bindingResult.reject("failed", e.getMessage());
            return "member/join";
        }
        return "member/login";
    }

    @GetMapping(value = "/iddouble")
    private String iddouble() {
        return "iddouble";
    }

    @GetMapping(value = "/idByUsername/{username}", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Map<String, Object> idByUsername(@PathVariable String username) {
        Map<String, Object> result = new HashMap<>();
        String msg = "불가능합니다.";
        try {
            service.selectUsername(username); // 있으면 해당 유저 정보
        } catch (Exception e) {
            msg = "가능합니다."; // 없는 유저
        }
        result.put("result", msg);
        return result;
    }

    @GetMapping(value = "/idByUseremail/{email}", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Map<String, Object> idByUseremail(@PathVariable String email) {
        Map<String, Object> result = new HashMap<>();
        result.put("result", service.selectEmail(email));
        return result;
    }
}
